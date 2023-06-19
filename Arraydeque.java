import java.util.*;
public class Arraydeque {
    public static void Printer(ArrayDeque<Integer> ad1){
            System.out.println(ad1.clone());
    }
    public static void main(String[] args) {
        ArrayDeque <Integer> ad1 = new ArrayDeque<>();
        ArrayDeque <Integer> ad2 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.add(4);
        ad1.add(5);
        ad1.add(6);

        //get method 
        System.out.println(ad1.getFirst());
        
        //Printing arraylist
        Printer(ad1);
        
        ad1.remove(4);
        //Printing modified arraylist
        Printer(ad1);


        ad2.add(7);
        ad2.add(8);
        ad2.add(9);
        ad2.add(10);
        ad2.add(11);
        ad2.add(12);

        

        ad1.addAll(ad2);
        // printing combined list 
        Printer(ad1);

        System.out.println(ad1.contains(7));
        
        //clearing the list
        ad1.clear();

        if(ad1.isEmpty()){
            System.out.println("list is empty");
        }

    }


}