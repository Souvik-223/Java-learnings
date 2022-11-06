import java.util.*;

public class tut10 {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of the array-");
    int size = sc.nextInt();
    int array[]=new int[size];

       System.out.println("Enter elements of the array- ");
       for (int i = 0; i < size; i++) {
           array[i]=sc.nextInt();
       }

       System.out.println("Enter the number you want to find in this array- ");
       int x = sc.nextInt();

       for (int i = 0; i < array.length ; i++) {
           if (x==array[i]) {
               System.out.println("The number is found at index "+i);
           }
       }
    }
}
