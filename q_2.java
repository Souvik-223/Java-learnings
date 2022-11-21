import java.util.*;
import java.lang.Math;

class threedobject{
    void  wholesurfacearea(){}
    void volume(){}
    threedobject(){}
}
class box extends threedobject{
    void wholesurfacearea(float l, float b, float h){
        float area = 2*l*b + 2*b*h + 2*l*h ;
        System.out.println("The whole surface area is : "+ area);
    }
    void volume(float l , float b, float h){
        float vol = l*b*h ;
        System.out.println("The volume is : "+ vol);
    }
    box(Float l, Float b ,Float h){
        wholesurfacearea(l,b,h);
        volume(l,b,h);
    }
}
class cube extends threedobject{
    void wholesurfacearea(Float l){
        float area = 6*l*l; 
        System.out.println("The whole surface area is : "+ area);
    }
    void volume(float l){
        float vol = l*l*l ;
        System.out.println("The volume is : "+ vol);
    }
    cube(Float l){
        wholesurfacearea(l);
        volume(l);
    }
}
class cyclinder extends threedobject{
    void wholesurfacearea(float h , float r){
        float area = (float) ((2.0*3.14*r*h) + (2.0*3.14*r*r));
        System.out.println("The whole surface area is : "+ area);
    }
    void volume(float h, float r){
        float vol = (float) (3.14*r*r*h);
        System.out.println("The volume is : "+ vol);
    }
    cyclinder(Float h, Float r){
        wholesurfacearea(h,r);
        volume(h,r);
    }
}
class cone extends threedobject{
    void wholesurfacearea(float h , float r){
        float area = (float) (3.14*r*(r+Math.sqrt((h*h * r*r))));
        System.out.println("The whole surface area is : "+ area);
    }
    void volume(float h, float r , float sh){
        float vol = (float) (3.14*r*r*(h/3));
        System.out.println("The volume is : "+vol);
    }
    cone(Float h , Float r , Float sh ){
        wholesurfacearea(h,r);
        volume(h,r,sh);
    }
}
public class q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l,b,h,sh,r;
        System.out.println("Choose from teh below options: ");
        System.out.println("Press 1 for box");
        System.out.println("Press 2 for cube");
        System.out.println("Press 3 for cyclinder");
        System.out.println("Press 4 for cone");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter the dimensions of Box:");
                System.out.println("Length: ");
                l = sc.nextInt();
                System.out.println("Breadth: ");
                b = sc.nextFloat();
                System.out.println("Height: ");
                h = sc.nextFloat();

                box box = new box(l, b, h);
                break;

            case 2:
                System.out.println("Enter the dimensions of cube:");
                System.out.println("Length: ");
                l = sc.nextFloat();

                cube cube = new cube(l);
                break;
        
            case 3:
                System.out.println("Enter the dimensions of Cyclinder:");
                System.out.println("Length: ");
                h = sc.nextFloat();
                System.out.println("Radius: ");
                r = sc.nextFloat();

                cyclinder cyclinder = new cyclinder(h, r);
                break;
        
            case 4:
                System.out.println("Enter the dimensions of cone:");
                System.out.println("height: ");
                h = sc.nextFloat();
                System.out.println("Radius: ");
                r = sc.nextFloat();
                System.out.println("Slant height: ");
                sh = sc.nextFloat();

                cone cone = new cone(h,r,sh);
                break;
        
            default:
            System.out.println("Wrong option selected");
                break;
        }

    }
}
