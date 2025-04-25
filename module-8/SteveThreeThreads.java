/*Steve Stylin Module 8.2
 * creation of a Java class named SteveThreeThreads that utilizes three separate threads to output different types of characters: random letters, 
 * random digits, and random special characters. Each thread should generate a minimum of 10,000 characters, 
 * formatted in lines of 50 characters each and a test program to test the code execution.
  */

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SteveThreeThreads {
    private static final int TOTAL_CHARACTERS = 10000;
    private static final int CHARACTERS_PER_LINE = 50;
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%&*";

    private JTextArea textArea;

    public SteveThreeThreads() {
        JFrame frame = new JFrame("Character Output");
        textArea = new JTextArea(20, 60);
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void startThreads() {
        Thread letterThread = new Thread(new CharacterGenerator(LETTERS, "Letters"));
        Thread digitThread = new Thread(new CharacterGenerator(DIGITS, "Digits"));
        Thread specialCharThread = new Thread(new CharacterGenerator(SPECIAL_CHARACTERS, "Special Characters"));

        letterThread.start();
        digitThread.start();
        specialCharThread.start();
    }

    private class CharacterGenerator implements Runnable {
        private String characters;
        private String type;

        public CharacterGenerator(String characters, String type) {
            this.characters = characters;
            this.type = type;
        }

        @Override
        public void run() {
            StringBuilder output = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < TOTAL_CHARACTERS; i++) {
                char randomChar = characters.charAt(random.nextInt(characters.length()));
                output.append(randomChar);

                // Add a newline after every 50 characters
                if ((i + 1) % CHARACTERS_PER_LINE == 0) {
                    output.append("\n");
                }
            }

            // Append the output to the JTextArea in a thread-safe manner
            SwingUtilities.invokeLater(() -> {
                textArea.append(type + ":\n" + output.toString() + "\n\n");
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SteveThreeThreads app = new SteveThreeThreads();
            app.startThreads();
        });
    }
}
