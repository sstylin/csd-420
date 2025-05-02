/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Steve Stylin
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void insertAddress(int id, String lastName, String firstName, String street, String city, String state, String zip) {
        // SQL query to insert address data into the database
        String insertSQL = "INSERT INTO address33 VALUES (?, ?, ?, ?, ?, ?, ?);";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            // Set the parameters for the prepared statement
            preparedStatement.setInt(1, id); // Set ID
            preparedStatement.setString(2, lastName); // Set last name
            preparedStatement.setString(3, firstName); // Set first name
            preparedStatement.setString(4, street); // Set street address
            preparedStatement.setString(5, city); // Set city
            preparedStatement.setString(6, state); // Set state
            preparedStatement.setString(7, zip); // Set ZIP code
            preparedStatement.executeUpdate(); // Execute the insert operation
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Data insertion failed: " + e.getMessage());
        }
    }
    
}
