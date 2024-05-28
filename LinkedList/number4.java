package LinkedList;
import java.util.*;
public class number4 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        
        System.out.println("Set of Numbers: " + numbers);

        ListIterator<Integer> listIterator = numbers.listIterator();
        while(listIterator.hasNext()){
            Integer value = listIterator.next();
            if (value % 2 != 0){
                listIterator.remove();
            }
        }
        System.out.println("Set of Even Numbers: " + numbers);
    }
}
