import java.util.*;

public class Linkedlist {
    public static void Printer(LinkedList<Integer> l1) {
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        // get method
        System.out.println(l1.get(5));

        // Printing LinkedList
        Printer(l1);

        l1.remove(4);
        // Printing modified LinkedList
        Printer(l1);

        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);

        l1.addAll(l2);
        
        // Additional linkedlist function
        l1.addLast(555);
        l1.addFirst(666);

        // printing combined list
        Printer(l1);

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));

        // clearing the list
        l1.clear();

        if (l1.isEmpty()) {
            System.out.println("list is empty");
        }
    }
}
