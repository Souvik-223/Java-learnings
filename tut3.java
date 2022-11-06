import java.util.*;
public class tut3{
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter two integer to perform operations:");
        int a=Sc.nextInt();
        int b=Sc.nextInt();

        System.out.println("CALCULATOR:- ");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulo");

        int n=Sc.nextInt();

        switch(n){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            case 5:System.out.println(a%b);
            break;
        }
    }
}
