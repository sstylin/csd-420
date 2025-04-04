// Steve Stylin Module 3: Use of Generic Methods
import java.util.Arrays;
import java.util.List;
public class GenericMethod {
    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 0, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));

        String[] strArray = {"The Notebook", "Fame", "Star Wars: Episode V - The Empire Strikes Back","The Godfather"};
        System.out.println("Before swap: " + java.util.Arrays.toString(strArray));
        swap(strArray, 0, 1);
        System.out.println("After swap: " + java.util.Arrays.toString(strArray));
    }
}
