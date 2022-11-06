import java.util.*;
public class tut15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO DO BIT MANIPULATION");
        int n = sc.nextInt();
        System.out.println("Enter the position to shift");
        int pos = sc.nextInt();

        System.out.println();
        //Get bit operation  - to find a bit
        System.out.println("Get bit operation"); 

        int bitmask_1 = 1<<pos;
        
        if ((bitmask_1 & n) == 0) {
            System.out.println("Bit is 0");
        } else {
            System.out.println("Bit is 1");
            
        }
        System.out.println();

        //Set bit operation - to set the bit to 1 
        System.out.println("Set bit operation"); 
        int bitmask_2= 1<<pos;
        int newnumber_2= bitmask_2 | n;

        System.out.println("The new position changed number is "+newnumber_2);
        System.out.println();

        //Clear bit operation - to remove a bit i.e to make it 0
        System.out.println("Clear bit operation"); 
        int bitmask_3= 1<<pos;
        int bitmask_3not= ~(bitmask_3);
        int newnumber_3= bitmask_3not & n;

        System.out.println("The new position changed number is "+newnumber_3);
        System.out.println();


        //Update bit operation - to update the bit to 0 or 1 
        System.out.println();
        //Case-1 - when we need to update 1 in the given position i.e set bit operation
        System.out.println("Update bit operation to 1"); 
        int bitmask_4= 1<<pos;
        int newnumber_4= bitmask_4 | n;

        System.out.println("The new position changed number is "+newnumber_4);
        System.out.println();

        //Case-2 - when we need to update 0 in the given position i.e Clear bit operation
        System.out.println("Update bit operation to 0"); 
        int bitmask_5= 1<<pos;
        int bitmask_5not= ~(bitmask_5);
        int newnumber_5= bitmask_5not & n;

        System.out.println("The new position changed number is "+newnumber_5);





    }
}
