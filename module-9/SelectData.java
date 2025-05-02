/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Steve Stylin
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {
    public static void selectAllAddresses() {
        String selectSQL = "SELECT * FROM address33;"; // SQL query to select all records from the address33 table

        try (Connection connection = DatabaseConnection.getConnection(); // Establishing a connection to the database
             Statement statement = connection.createStatement(); // Creating a statement to execute the SQL query
             ResultSet resultSet = statement.executeQuery(selectSQL)) { // Executing the query and storing the result set
            while (resultSet.next()) { // Iterating through the result set
                System.out.println("ID: " + resultSet.getInt("ID") + // Printing the ID from the result set
                        ", Last Name: " + resultSet.getString("LASTNAME") + // Printing the last name from the result set
                        ", First Name: " + resultSet.getString("FIRSTNAME") + // Printing the first name from the result set
                        ", Street: " + resultSet.getString("STREET") + // Printing the street from the result set
                        ", City: " + resultSet.getString("CITY") + // Printing the city from the result set
                        ", State: " + resultSet.getString("STATE") + // Printing the state from the result set
                        ", ZIP: " + resultSet.getString("ZIP")); // Printing the ZIP code from the result set
            }
        } catch (SQLException e) { // Catching any SQL exceptions that may occur
            System.out.println("Data selection failed: " + e.getMessage()); // Printing an error message if data selection fails
        }
    }

    public static void main(String[] args) {
        CreateTable.createAddressTable(); // Creating the address table
        InsertData.insertAddress(24, "Lou", "Woods", "1919 Bluewing Circle", "Bellevue", "NE", "68123"); // Inserting an address record
        InsertData.insertAddress(25, "Lou", "Woods", "1919 Bluewing Circle", "Bellevue", "NE", "68123"); // Inserting another address record
        InsertData.insertAddress(26, "Lou", "Woods", "1919 Bluewing Circle", "Bellevue", "NE", "68123"); // Inserting yet another address record
        selectAllAddresses(); // Calling the method to select and display all addresses
    }
}
