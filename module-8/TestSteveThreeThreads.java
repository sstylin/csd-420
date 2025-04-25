/*Steve Stylin Module 8.2
 * creation of a Java class named SteveThreeThreads that utilizes three separate threads to output different types of characters: random letters, 
 * random digits, and random special characters. Each thread should generate a minimum of 10,000 characters, 
 * formatted in lines of 50 characters each and a test program to test the code execution.
  */

import javax.swing.*;
import java.awt.*;
import java.util.Random;

        lass TestSteveThreeThreads {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        boolean success = true;
        SteveThreeThreads app = new SteveThreeThreads();
        
        // Start the threads
        app.startThreads();

        long endTime = System.currentTimeMillis();
        System.out.println("Execution Start Time: " + startTime);
        System.out.println("Execution End Time: " + endTime);

        if (success) {
            System.out.println("Execution completed successfully.");
        } else {
            System.out.println("Execution failed.");
        }
        System.out.println("Test completed. Check the GUI for output.");
    }
}
