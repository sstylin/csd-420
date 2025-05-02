/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Steve Stylin
 */

import java.sql.Connection; // Import the Connection class from the java.sql package
import java.sql.DriverManager; // Import the DriverManager class for managing database connections
import java.sql.SQLException; // Import the SQLException class for handling SQL exceptions

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/databasedb"; // Database URL
    private static final String USER = "student1"; // Database username
    private static final String PASSWORD = "pass"; // Database password

    public static Connection getConnection() {
        Connection connection = null; // Initialize the connection variable to null
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL driver
            connection = DriverManager.getConnection(URL, USER, PASSWORD); // Establish the connection using DriverManager
            System.out.println("Connection established successfully."); // Print success message
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found: " + e.getMessage()); // Handle case where driver is not found
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage()); // Handle SQL exceptions during connection
        }
        return connection; // Return the established connection
    }

    public static void main(String[] args) {
        getConnection(); // Call the method to establish a connection
    }
}
