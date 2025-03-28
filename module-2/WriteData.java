// Steve Stylin Module2: Program to write data into stevedatafile.dat
import java.io.*;
import java.util.Random;

public class WriteData {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[5];
        double[] doubleArray = new double[5];

        // Generate random integers and doubles
        for (int i = 0; i < 5; i++) {
            intArray[i] = random.nextInt(100); // Random integers between 0 and 99
            doubleArray[i] = random.nextDouble() * 100; // Random doubles between 0.0 and 99.99
        }

        // Write data to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("stevedatafile.dat", true))) {
            for (int num : intArray) {
                writer.write(num + " ");
            }
            writer.newLine();
            for (double num : doubleArray) {
                writer.write(num + " ");
            }
            writer.newLine();
            System.out.println("Data written to stevedatafile.dat successfully.");
            System.out.println("File path: " + new File("stevedatafile.dat").getAbsolutePath());
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
