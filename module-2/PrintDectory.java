

// Steve Stylin: Module 2 Printing a Directory Structure File List Using Recursion

import java.io.File;

public class PrintDectory {

    public static void main(String[] args) {
        // Specifying the Adbvance java class module 2 directory path
        File directory = new File("C:\\csd\\csd-420\\module-2");
        
        // Start printing the directory structure
        printDirectoryStructure(directory, 0);
    }

    public static void printDirectoryStructure(File file, int level) {
        // Check if the file is a directory
        if (file.isDirectory()) {
            // Print the directory name with indentation
            System.out.println(getIndentation(level) + "DIR\\" + file.getName());
            // List all files and directories within this directory
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    // Recursive call for each file/directory
                    printDirectoryStructure(f, level + 1);
                }
            }
        } else {
            // Print the file name with indentation
            System.out.println(getIndentation(level) + file.getName());
        }
    }

    // Helper method to create indentation based on the level of recursion
    private static String getIndentation(int level) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indentation.append("    "); // 4 spaces for each level
        }
        return indentation.toString();
    }
}
