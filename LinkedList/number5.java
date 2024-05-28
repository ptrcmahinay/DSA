package LinkedList;
import java.util.*;
public class number5 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Anna");
        names.add("Brice");
        names.add("Mary");
        names.add("Penelope");
        names.add("Rose");

        System.out.println("List of Names: " + names);

        String studentToFind = "Mary";
        if (names.contains(studentToFind)) {
            System.out.println("We had " + studentToFind + " on the list.");
        } else {
            System.out.println("We can't find " + studentToFind + " on the list.");
        }

    }
}
