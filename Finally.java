public class Finally {  // Finally block always gets executed no matter what 
    static int greet(){
        try {
            int a =9,b=0;
            int c = a/b;
            return c;
            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{  // Even if the function returns before finally block finally always gets executed
            System.out.println("This is the finally block.");
        }
        return -1;
    } 
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int num = 9;
        while (num > -1 ) {
            try {
                int div =9/num-2;
                System.out.println(div);
            } 
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally{  // Even if the loop breaks finally will get executed always
                System.out.println("This is finally block 2");
            }
            num--;

        }


        // It is must to use try with a catch but we can also use a finally in place of catch and it will be syntaxically correct.
        try {
            // code     // The code will be executed but if an error occurs then exception is thrown 
        } 
        finally{
            System.out.println("This is also correct");
        }
    }
}
