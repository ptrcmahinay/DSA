package LinkedList;

import java.util.LinkedList;

public class number3 {
    public static void main(String[] args) {
        LinkedList<String> flowers = new LinkedList<>();
        
        flowers.add("Daisy");
        flowers.add("Marigold");
        flowers.add("Rose");
        
        System.out.println("Original list of flowers: " + flowers);

        flowers.addFirst("Carnation");
        flowers.addLast("Sunflower");

        System.out.println("Finalized list of flowers: " + flowers);
    }
}
