import java.util.*;

public class tut11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows-");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns-");
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];

        // input
        System.out.println("Enter the 2d array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("The Entered array is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number you want to search for- ");
        int num = sc.nextInt();

        // Checking for the number in the 2d array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (num == arr[i][j]) {
                    System.out.println("The index is " + i + " " + j);
                }
            }
        }
    }
}
