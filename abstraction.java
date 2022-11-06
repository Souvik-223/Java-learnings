abstract class animal{
    abstract void Walk();
    void breathe() {
        System.out.println("This animal breaths air");
    }
    animal(){
        System.out.println("you are about to create an animal.");
    }
}

class horse extends animal{
    void Walk(){
        System.out.println("This animal walks on 4 legs");
    }
    horse(){
        System.out.println("This is a horse");
    }
}

class chicken extends animal{
    void Walk(){
        System.out.println("This animal walks on 2 legs");
    }
    chicken(){
        System.out.println("This a chicken");
    }
}
public class abstraction {
    public static void main(String[] args) {
        horse Horse = new horse();
        Horse.Walk();
        chicken Chicken = new chicken();
        Chicken.Walk();

        
    }
}
