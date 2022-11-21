/* Design an abstract class having two methods. Create Rectangle and 
Triangle classes by inheriting the shape class and override the above 
methods to suitably implement for Rectangle and Triangle class. */

import java.util.Scanner;
abstract class shape {
    void area (){}
    void side(){}
}
class reactangle extends shape {
    int a , b;
    void area(){
        int area = a * b;
        System.out.println("The area is- "+area);
    }
    void side(int n){
        System.out.println("The no. of sides in the obeject is- "+n);
    }
}
class Triangle extends shape {
    int b, h;
    void area(){
        int area = 1/2 * b *h ;
        System.out.println("The area is- "+area);
    }
    void side(int n){
        System.out.println("The no. of sides in the obeject is- "+n);
    }
}

public class q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reactangle RC = new reactangle();
        Triangle t = new Triangle();
        System.out.println("Choose the option");
        System.out.println("Press 1 for reactangle.");
        System.out.println("Press 2 for triangle.");
        int i = sc.nextInt();

        if (i==1) {
            System.out.println("Enter the no. of sides in the objects.");
            int n = sc.nextInt();
            
            System.out.println("Enter the no. of dimensions of the object. ");
            System.out.println("length: ");
            RC.a = sc.nextInt();
            System.out.println("Breadth: ");
            RC.b = sc.nextInt();
            RC.side(n);
            RC.area();
        }

        else if (i==2) {
            System.out.println("Enter the no. of sides in the objects.");
            int n = sc.nextInt();
            
            System.out.println("Enter the no. of dimensions of the object. ");
            System.out.println("height: ");
            t.h = sc.nextInt();
            System.out.println("Base: ");
            t.b = sc.nextInt();
            t.side(n);
            t.area();
        }


        
    }
    
}
