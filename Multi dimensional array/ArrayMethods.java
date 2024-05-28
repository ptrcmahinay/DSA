import java.util.*;
public class ArrayMethods {
    public static void main(String[] args) {
        // Arrays.sort() - ascending order
        int[] array = {3, 2, 1};
        Arrays.sort(array);
        for (int i : array){
            System.out.print(i + ", ");
        }

        // Arrays.fill(array name, value) - fill an entire array with a single value
        int[] array1 = new int[3];
        Arrays.fill(array1, 1);
        for (int i : array1){
            System.out.println(i + ", ");
        }
        // Output: [1, 1, 1, 1]

        // Arrays.toString() - convert array into string format
        System.out.println(Arrays.toString(array));
        // output: [1, 2, 3]

        // Arrays.copyOf(array name, array length) - create a new array that is copy of an existing array
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copy));

        // Arrays.equals() - check if 2 arrays are equal (length, order, elements)
        boolean isEqual = Arrays.equals(original, copy);
        System.out.println(isEqual);

        // Arrays.binarySearch() - search for a specific element in array
        int index = Arrays.binarySearch(array, 2);
        System.out.println(index);

    }
}
