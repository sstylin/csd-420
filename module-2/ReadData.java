
// Steve Stylin Module 2: Program to read data form stevedatafile.dat
import java.io.*;

public class ReadData {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("stevedatafile.dat"))) {
            String line;
            System.out.println("Data from stevedatafile.dat:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
