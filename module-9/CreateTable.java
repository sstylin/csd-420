/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 * This class is responsible for creating a database table for storing address information.
 * 
 * @author Steve Stylin
 */

import java.sql.Connection; // Importing the Connection class for database connection
import java.sql.SQLException; // Importing SQLException to handle SQL-related exceptions
import java.sql.Statement; // Importing Statement class to execute SQL statements

public class CreateTable {
    // Method to create the address table in the database
    public static void createAddressTable() {
         // SQL statement to drop the address table if it exists
        String dropTableSQL = "DROP TABLE IF EXISTS address33;";
        // SQL statement to create the address table if it does not already exist
        String createTableSQL = "CREATE TABLE IF NOT EXISTS address33 (" +
                "ID int PRIMARY KEY, " + // ID column as primary key
                "LASTNAME varchar(40), " + // Last name column
                "FIRSTNAME varchar(40), " + // First name column
                "STREET varchar(40), " + // Street address column
                "CITY varchar(40), " + // City column
                "STATE varchar(40), " + // State column
                "ZIP varchar(40));"; // ZIP code column

        // Try-with-resources statement to ensure resources are closed after use
        try (Connection connection = DatabaseConnection.getConnection(); // Establishing a connection to the database
             Statement statement = connection.createStatement()) { // Creating a statement object to execute SQL
            statement.execute(createTableSQL); // Executing the SQL statement to create the table
            System.out.println("Table created successfully."); // Confirmation message upon successful table creation
        } catch (SQLException e) { // Catching SQL exceptions that may occur
            System.out.println("Table creation failed: " + e.getMessage()); // Error message if table creation fails
        }
    }

    // Main method to execute the createAddressTable method
    public static void main(String[] args) {
        createAddressTable(); // Calling the method to create the address table
    }
}
