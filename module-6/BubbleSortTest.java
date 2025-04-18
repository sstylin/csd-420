
// Steve Stylin Module 6..1
import java.util.Comparator;

public class BubbleSortTest {
    public static void main(String[] args) {
        // Test with integers
        Integer[] numbers = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10};
        System.out.println("Sorting integers using Comparable:");
        BubbleSort.bubbleSort(numbers);
        System.out.println("Sorted integers:");
        BubbleSort.printArray(numbers);

        // Test with car makes
        String[] carMakes = {"Toyota", "Honda", "Ford", "BMW", "Audi", "Chevrolet", "Nissan", "Hyundai", "Kia", "Volkswagen"};
        System.out.println("\nSorting car makes using Comparator:");
        BubbleSort.bubbleSort(carMakes, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Sorted car makes:");
        BubbleSort.printArray(carMakes);
    }
}
