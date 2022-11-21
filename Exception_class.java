import java.util.Scanner;

class myexception extends Exception {
    @Override
    public String toString() {    // This is the method that is shown when the exception is thrown and exception is printed through e. It tells about the error  
        return "The number is negative";
    }
    
    @Override
    public String getMessage() {  // This is the method we need to call when an exception occurs to know more about the type of error.  
        return "The number is negative so enter a positive value";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(); // We take a number input 
        
        if (a<9) {  // We check if it is a one digit number or not 
            System.out.println("The number entered is less than 9");
            try {
                if(a<0){
                    throw new myexception();  // If the number is negative we throw an exception otherwise we continue
                }
            } 
            catch (Exception e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                e.printStackTrace();  // This method prints the stack trace of the exception 
            }
        } 
        else {
           System.out.println("The number is greater than 9"); 
        }
    }
}
