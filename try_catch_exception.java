public class try_catch_exception {
    public static void main(String[] args) {
     int a=10;
     int b =0;
     try {
         int c = a/b;   
        System.out.println("C is "+c);
     } catch (Exception e) {
        System.out.println(e);
     }
    }
}
