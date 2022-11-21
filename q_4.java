/* Write a program to create a class named Vehicle having protected 
instance variables regnNumber, speed, color, ownerName and a method 
showData ( ) to show “This is a vehicle class”. Inherit the Vehicle class 
into subclasses named Bus and Car having individual private instance 
variables routeNumber in Bus and manufacturerName in Car and both of 
them having showData ( ) method showing all details of Bus and Car 
respectively with content of the super class’s showData ( ) method. */

class vehicle{
    protected int regnNumber;
    protected int speed;
    protected String color;
    protected String OwnerName;
    
    void showData(){
        System.out.println("This is vehical class");
    }

}
class bus extends vehicle{
    private int routeNumber = 22;
    void showData(){
        super.showData();
        System.out.println("This is bus class");
        System.out.println("The regnNumber is "+regnNumber);
        System.out.println("The speed is "+speed);
        System.out.println("The color is "+ color);
        System.out.println("The OwnerName  is "+ OwnerName);
        System.out.println("The routenumber is "+routeNumber);
    }

}

class Car extends vehicle{
    private String manufacturerName = "souvik";
    void showData(){
        super.showData();
        System.out.println("This is car class");
        System.out.println("The regnNumber is "+regnNumber);
        System.out.println("The speed is "+speed);
        System.out.println("The color is "+ color);
        System.out.println("The OwnerName  is "+ OwnerName);
        System.out.println("The routenumber is "+ manufacturerName);
    }

}

public class q_4 {
    public static void main(String[] args) {
     bus b = new bus();
     Car c = new Car();

     b.regnNumber = 12; 
     b.speed = 120; 
     b.color = "red"; 
     b.OwnerName = "Souvik"; 

     c.regnNumber = 14; 
     c.speed = 320; 
     c.color = "black"; 
     c.OwnerName = "Souvik"; 
    }
}
