package LinkedList;

import java.util.*;
public class number2 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
