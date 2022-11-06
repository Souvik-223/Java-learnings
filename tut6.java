import java.util.*;

public class tut6 {
    public static void main(String[] args) {
            // ADVANCE PATTERNS

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:-");
        int a =Sc.nextInt();
        System.out.println("Enter the no. of Columns:-");
        int b =Sc.nextInt();

        /*Butterfly pattern
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

        */
        

        // Answer:

        // Top part-
        // for (int i = 1; i <=a; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int k = 1; k <=b-(i+i); k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j > 0; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Bottom part-
        // for (int i = a; i > 0; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int k = 1; k <=b-(i+i); k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j > 0; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        /* Solid rhombus
            *****
           *****
          *****
         *****
        *****

        */

        // Answer:- 

        // for (int i = 1; i <=a ; i++) {
        //     for (int k = 1; k <=a-i; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= b; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        /* Number pyramid
             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5
        */

        // Answer
        // for (int i = 1; i <= a; i++) {
        //     for (int j = a; j > i ; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }


         /* Palindromic pattern 
             1
            212
           32123
          4321234
         543212345
        */

        // Answer
        // for (int i = 1; i <= a; i++) {
        //         for (int j = a; j > i ; j--) {
        //             System.out.print(" ");
        //         }

        //         // 1st half 
        //         for (int j = i; j>=1; j--) {
        //             System.out.print(j);
        //         }

        //         //2nd half
        //         for (int j = 2; j <= i ; j++) {
        //             System.out.print(j);
        //         }
        //         System.out.println();
        //     }


        /* Diamond pattern 
             *
            ***
           *****
          *******
          *******
           *****
            ***
             *
        */

        // Answer
        //top half
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=a-i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2*i)-1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom half
        for (int i = a; i >=1; i--) {
            for (int j = 1; j <=a-i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2*i)-1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
