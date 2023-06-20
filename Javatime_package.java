import java.time.LocalDate;

public class Javatime_package {
    public static void main(String[] args) {
        //gives current date 
        LocalDate d = LocalDate.now();
        System.out.println(d);

        //gives current time
        LocalDate t = LocalDate.now();
        System.out.println(t);

        //gives current date and time
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
    }
}
