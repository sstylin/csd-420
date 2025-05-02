import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SakilaDatabaseExample {
    // Database URL, username, and password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USER = "root"; 
    private static final String PASS = "Bellevue2021"; 

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Establishing a connection to the database
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database successfully!");

            // Creating a statement to execute SQL queries
            statement = connection.createStatement();
            String sql = "SELECT first_name, last_name FROM actor LIMIT 10"; // Query to retrieve data
            ResultSet resultSet = statement.executeQuery(sql);

            // Processing the result set
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println("Actor: " + firstName + " " + lastName);
            }

            // Closing the result set
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Closing resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
