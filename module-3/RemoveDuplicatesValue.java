
// Steve Stylin Module 3: removal of duplicate values from an ArrayList
import java.util.ArrayList;
import java.util.Random;

/**
 * This class demonstrates the removal of duplicate values from an ArrayList.
 */
public class RemoveDuplicatesValue {

    public static void main(String[] args) {
        // Step 1: Create an ArrayList and fill it with random values
        ArrayList<Integer> originalList = generateRandomList(50, 1, 20);
        
        // Display the original list
        System.out.println("Original List: " + originalList);
        
        // Step 2: Remove duplicates
        ArrayList<Integer> uniqueList = removeDuplicates(originalList);
        
        // Display the list without duplicates
        System.out.println("List without Duplicates: " + uniqueList);
    }

    /**
     * Generates an ArrayList filled with random integers.
     *
     * @param size the number of random integers to generate
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive)
     * @return an ArrayList containing random integers
     */
    public static ArrayList<Integer> generateRandomList(int size, int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt((max - min) + 1) + min);
        }
        
        return list;
    }

    /**
     * Removes duplicate elements from the provided ArrayList.
     *
     * @param list the original ArrayList from which duplicates will be removed
     * @param <E> the type of elements in the ArrayList
     * @return a new ArrayList containing unique elements
     */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> uniqueList = new ArrayList<>();
        
        for (E element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        
        return uniqueList;
    }
}
