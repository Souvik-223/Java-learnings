import java.util.*;
public class tut7 {
    public static void Factorial(int n) {
        int fact=1;
        if (n<0) {
            System.out.println("Invalid");
            return;
        }
        for (int i = n; i>=1; i--) {
            fact=fact*i;
        }
        
        System.out.println(fact);
        return;
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the numbetr to get factorial of :-");
        int a=Sc.nextInt();

        Factorial(a);
    }
}
