// Steve Stylin Module: 5 Word Processor

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class WordProcessor {
    public static void main(String[] args) {
        Set<String> uniqueWords = new TreeSet<>();
        List<String> originalWords = new ArrayList<>();

        // Read words from the file
        try (BufferedReader br = new BufferedReader(new FileReader("collection_of_words.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                originalWords.add(line);
                uniqueWords.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Prepare data for the table
        List<String> ascendingOrder = new ArrayList<>(uniqueWords);
        List<String> descendingOrder = new ArrayList<>(uniqueWords);
        Collections.reverse(descendingOrder);

        // Display results in a table
        displayResults(originalWords, ascendingOrder, descendingOrder);
    }

    public static void displayResults(List<String> original, List<String> ascending, List<String> descending) {
        String[] columnNames = {"Original Words", "Ascending Order", "Descending Order"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        int maxSize = Math.max(original.size(), Math.max(ascending.size(), descending.size()));
        for (int i = 0; i < maxSize; i++) {
            String originalWord = (i < original.size()) ? original.get(i) : "";
            String ascendingWord = (i < ascending.size()) ? ascending.get(i) : "";
            String descendingWord = (i < descending.size()) ? descending.get(i) : "";
            model.addRow(new Object[]{originalWord, ascendingWord, descendingWord});
        }

        JTable table = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "Word Display", JOptionPane.INFORMATION_MESSAGE);
    }
}
