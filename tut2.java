// if a number is odd or even 
import java.util.*;

public class tut2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("Checking if the number is odd or even\n");
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
