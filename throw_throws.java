import java.util.Scanner;

//Creating custom exception
class NegativeException extends Exception{
    @Override
    public String toString() {
        return "The radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "The radius of the circle must be positive";
    }
}



public class throw_throws {
    static double area (int r) throws NegativeException{  // Gives a message that it throws an Exception  
        if (r<0) {
            throw new NegativeException();
        }
       double a = Math.PI*r*r;
        return a;
    }
    
    
    static int divide(int a, int b) throws ArithmeticException{  // throws gives a wring to the programmer that an exception might occur here
        //Made by souvik 
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //Used by shivam 
        int a =9 , b=0;
        try {  // we use try catch to ensure that the exception is catched and error dosen't occur
            int c = divide(a,b);
            System.out.println("The result is "+c);
            
        } 
        catch (Exception e) {
            System.out.println("Exception occured!");
        }



        // Using area method to get the area circle
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        try {
            double area = area(r);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


// In production we will be handling exceptions and deciding whether we wish to continue th eprogram or we wish to stop it.
