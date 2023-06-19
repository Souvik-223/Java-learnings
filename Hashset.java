import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(4);
        h1.add(5);
        h1.add(6);

        // Printing arraylist
        System.out.println(h1);

        h1.remove(4);
        // Printing modified arraylist
        System.out.println(h1);

        h2.add(7);
        h2.add(8);
        h2.add(9);
        h2.add(10);
        h2.add(11);
        h2.add(12);

        h1.addAll(h2);
        // printing combined list
        System.out.println(h1);

        System.out.println(h1.contains(7));

        // clearing the list
        h1.clear();

        if (h1.isEmpty()) {
            System.out.println("list is empty");
        }

    }
}
