import bank.*;
class pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writng something");
    }

    // non-parameterrized constructor
    public void printcolor() {
        System.out.println(this.color);
    }
}

class student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parameterized constructor
    // student(String name , int age){
    // this.name = name;
    // this.age=age;
    // }

    // //Copy consructors
    // student(student s2){
    // this.name = s2.name;
    // this.age = s2.age;
    // }

    // student(){

    // }

    // This is called method overloading in which same method name is used but have
    // different functions
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}
//Hybrid inheritance 
class shape {
    String color;
    public void area(){
        System.out.println("Displaying area");
    }
}

class triangle extends shape {
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}
// Multi level inheritance 
class equilateraltriangle extends triangle{
    public void area(int l , int b){
        System.out.println(1/2*l*b);
    }
}

// Hirearchical inheritance 
class cricle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class oops{
    public static void main(String[] args) {
        // pen pen1 = new pen(); 
        // pen1.color = "red";
        // pen1.type = "gel";
        // pen1.write();
        // pen1.printcolor();

        // student s1 = new student("aman",24);
        // s1.printInfo();

        // student s1 = new student();
        // s1.name="aman";
        // s1.age=24;

        // student s2 = new student(s1);
        // s2.printInfo();

        // Polymorphism

        // s1.printInfo();
        // s1.printInfo(s1.name);
        // s1.printInfo(s1.age);

        // Inheritance

        // triangle t1 = new triangle();
        // t1.color = "red";


        //Packages
        bank.account user = new bank.account();
        user.name = "souvik";
    }
}
