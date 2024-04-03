import java.util.*;
public class ArrayOperations {

    public static void main(String[] args) {
        // Accessing elements
        int[][] array = {
        {1, 2, 3},
        {4, 5, 6,}
        };

        int element = array[1][2];

        // Updating elements
        array[0][1] = 10;

        // searching
        int target = 5;
        boolean found = false;

        for (int[] row: array) {
            for (int num : row) {
                if(num == target) {
                    found = true;
                    break;
                }
            }
        }

        if(found){
            System.out.println("Element " + target + " found");
        } else{
            System.out.println("Element " + target + " not found");
        }


        // SORTING
        int[][] array2 = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };

        for (int[] row: array2) {
            Arrays.sort(row);
        }

        System.out.println("Sorted array:");
        for(int[] row : array2){
            System.out.println(Arrays.toString(row));
        }

        // Filtering - selecting elements based on a specified condition. e.g. print even num
        System.out.println("Filtered elements are:");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 == 0){
                    System.out.print(array[i][j] + ", ");
                }
            }
        }

        // TRAVERSAL - iterating through all elements of a multi-dimensional array to perform some operation on each element
        for (int[] row : array){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
            

    }
}    