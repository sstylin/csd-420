// Steve Stylin Module 10.2

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class FanInfoManager {

    // Database URL for MySQL connection, including SSL and timezone settings
    private static final String DB_URL = "jdbc:mysql://localhost:3306/databasedb?useSSL=false&serverTimezone=UTC";
    // Database user credentials
    private static final String USER = "student1";
    private static final String PASS = "pass";

    private JFrame frame;
    private JTextField idField, firstNameField, lastNameField, favoriteTeamField;
    private JButton displayButton, updateButton;

    public FanInfoManager() {
        // Initialize the main frame for the application
        frame = new JFrame("Fan Information Manager");
        idField = new JTextField(10);
        firstNameField = new JTextField(25);
        lastNameField = new JTextField(25);
        favoriteTeamField = new JTextField(25);
        displayButton = new JButton("Display");
        updateButton = new JButton("Update");

        // Action listener for the display button
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayFanInfo();
            }
        });
        // Action listener for the update button
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateFanInfo();
            }
        });
        // Create and set up the panel for input fields and buttons
        JPanel panel = new JPanel();
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(displayButton);
        panel.add(new JLabel("First Name:"));
        panel.add(firstNameField);
        panel.add(new JLabel("Last Name:"));
        panel.add(lastNameField);
        panel.add(new JLabel("Favorite Team:"));
        panel.add(favoriteTeamField);
        panel.add(updateButton);
        // Add the panel to the frame and set frame properties
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void displayFanInfo() {

        int id = Integer.parseInt(idField.getText()); // Parse the ID from the input field
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM fans WHERE ID = ?")) {
            stmt.setInt(1, id); // Set the ID parameter for the SQL query
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {

                // Populate the text fields with fan information from the database
                firstNameField.setText(rs.getString("firstname"));
                lastNameField.setText(rs.getString("lastname"));
                favoriteTeamField.setText(rs.getString("favoriteteam"));
            } else {

                JOptionPane.showMessageDialog(frame, "Fan not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateFanInfo() {
        // Parse the ID and retrieve values from the input fields
        int id = Integer.parseInt(idField.getText());
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String favoriteTeam = favoriteTeamField.getText();
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement stmt = conn.prepareStatement(
                        "UPDATE fans SET firstname = ?, lastname = ?, favoriteteam = ? WHERE ID = ?")) {
            stmt.setString(1, firstName); // Set the first name parameter
            stmt.setString(2, lastName);// Set the last name parameter
            stmt.setString(3, favoriteTeam); // Set the favorite team parameter
            stmt.setInt(4, id);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(frame, "Fan information updated successfully.");
            } else {
                JOptionPane.showMessageDialog(frame, "Fan not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Print SQL exception details
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC Driver
            new FanInfoManager(); // Create an instance of FanInfoManager
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Print exception details if driver is not found
            JOptionPane.showMessageDialog(null, "MySQL JDBC Driver not found.");
        }
    }

}
