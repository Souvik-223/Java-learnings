import java.util.Scanner;

public class Handling_specific_Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Enter the array index to get the value: ");
        int index = sc.nextInt();

        System.out.println("Enter the number you wish to divide the value by- ");
        int k = sc.nextInt();

        try {
            System.out.println("The array index value is "+arr[index]);
            System.out.println("The answer of array-value/number is "+arr[index]/k);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutofBound Exception occurred!");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some other Exception occurred!");
            System.out.println(e);
        }

    }
}
