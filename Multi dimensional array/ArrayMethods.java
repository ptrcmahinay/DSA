import java.util.*;
public class ArrayMethods {
    public static void main(String[] args) {
        // Arrays.sort() - ascending order
        int[] array = {3, 2, 1};
        Arrays.sort(array);
        for (int i : array){
            System.out.print(i + ", ");
        }
    }
}
