import java.util.*;
public class Nested_trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        boolean flag = true;
        while(flag){
            System.out.println("Enter the array index to get the value: ");
            int index = sc.nextInt();
            
            try {
                System.out.println("Welcome to lecture 82:");
                try {
                
                    System.out.println("The array index value is "+arr[index]);
                    flag = false; 
                } 
                catch (Exception e) {
                    System.out.println("ArrayIndexOutofBound Exception occurred!");
                }
            } 
            catch (Exception e) {
                System.out.println("Some other Exception occurred!");
                System.out.println(e);
            }
        }
        System.out.println("Thanks for using this program! ");
    }
}
