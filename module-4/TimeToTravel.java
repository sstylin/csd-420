
/*Steve Stylin Module 4: LinkedList and test the time to traverse the list using an iterator vs. using the get(index)*/

import java.util.LinkedList;
import java.util.Iterator;

/**
 * This class demonstrates the performance comparison of traversing a LinkedList
 * using an iterator versus the get(index) method.
 */

public class TimeToTravel {

    public static void main(String[] args) {
        // Test with 50,000 integers
        testTimeToTravel(50000);
        // Test with 500,000 integers
        testTimeToTravel(500000);
    }

    /**
     * Tests the traversal of a LinkedList with the specified number of integers.
     *
     * @param size the number of integers to store in the LinkedList
     */
    private static void testTimeToTravel(int size) {
        LinkedList<Integer> list = new LinkedList<>();

        // Populate the LinkedList with integers
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        // Measure time taken using an iterator
        long startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.nanoTime();
        long iteratorTime = endTime - startTime;

        // Measure time taken using get(index)
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        long getTime = endTime - startTime;

        // Print results in a beautiful fashion way
        System.out.println("\u001B[34mTime taken using Iterator for " + size + " integers: " + iteratorTime + " ns\u001B[0m");
        System.out.println("\u001B[32mTime taken using get(index) for " + size + " integers: " + getTime + " ns\u001B[0m");
        System.out.println("\u001B[31mDifference: " + (getTime - iteratorTime) + " ns\u001B[0m");
    }
}
