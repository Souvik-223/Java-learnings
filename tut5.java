import java.util.*;

public class tut5 {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        // PATTERNS PRINTING WITH LOOPS 
        /*  Pattern -1 
        *****
        *****      Solid rectangle 
        *****
        *****
        */
        
        //Answer
        // for (int i = 0; i < 4; i++) {
        //         for (int j = 0; j < 5; j++) {
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }


        /* Pattern -2 
        *****
        *   *
        *   *       Hollow rectangle 
        *****
        */

        //Answer
        // for (int i = 1; i <=4; i++) {
        //         for (int j = 1; j <=5; j++) {
        //             if (i==1 || j==1 || i==4 || j==5){
        //                 System.out.print("*");
        //             }
        //             else{   
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.println();
        // }


        /* Pattern - 3
        *
        **
        ***
        ****
        */

        //Answer
        // for (int i = 1; i <=4; i++) {
        //         for (int j = 0; j < i; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        // }


        /* Pattern- 4
        ****
        ***
        **
        *
        */

        //Answer
        // for (int i = 4; i > 0 ; i--) {
        //         for (int j = 0; j < i; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        // }


        /* Pattern - 5
            *
           **
          ***
         ****
         */

        //Answer 
        // for (int i = 1; i <=4; i++) {
        //         for(int k=0; k<3: k++){
        //                  system.out.print(" ");
        //         }
        //         for (int j = 0; j < i; j++) {
        //                 System.out.print("*");
        //             }
        //             System.out.println();
            
        // }


        /* Pattern - 6
        1
        12
        123
        1234
        12345
        */


        // Answer
        // for (int i = 1; i <=5; i++) {
        //         for (int j = 1; j <=i; j++) {
        //                 System.out.print(j);
        //         }
        //         System.out.println();
        // }


        /*Pattern - 7
        12345
        1234
        123
        12
        1
        */

        //Answers 
        // for (int i = 1; i <=5; i++) {
        //             for (int j = 1; j <=5-i+1; j++) {
        //                     System.out.print(j);
        //             }
        //             System.out.println();
        //     }

        // }  
        
        
        /* Pattern-8
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */

        // Answers 
        // int count=1;
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }


        /* Pattern- 9
        1
        01
        101
        0101
        10101
        */

        //Answers 
        for (int i = 1; i <=5; i++){
            for (int j = 1; j <=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
