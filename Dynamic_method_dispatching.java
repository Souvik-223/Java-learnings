class phone{
    void greet(){
        System.out.println("Hello i am phone");
    }
    void on(){
        System.out.println("The phone has turned on");
    }
}
class smartphone extends phone{
    void time(){
        System.out.println("The time is 8 o clock");
    }
    void on(){
        System.out.println("The smartphone has turned on");
    }
}

public class Dynamic_method_dispatching {
    public static void main(String[] args) {
        phone p = new smartphone(); // Allowed
        p.on();      // The on() in the smartphone class will be called as the object is of smartphone class
        p.greet();  // As the identifier is of phone class so all phone properties can be used
//        p.time();  // Not allowed as the reference identifier is of phone class so it cannot access the smartphone properties
    }
}