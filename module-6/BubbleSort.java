
// Steve Stylin Module 6.2
import java.util.Comparator;

public class BubbleSort {

    // Method using Comparable interface
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean swapped;
        for (int i = 0; i < list.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    // Swap elements
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
            // Print the current state of the list
            printArray(list);
            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    // Method using Comparator interface
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean swapped;
        for (int i = 0; i < list.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (comparator.compare(list[j], list[j + 1]) > 0) {
                    // Swap elements
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
            // Print the current state of the list
            printArray(list);
            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    // Helper method to print the array
    public static <E> void printArray(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
