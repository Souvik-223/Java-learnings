interface animal {
    void walk();
    void eat();

}
class lion implements animal{
    public void walk(){
        System.out.println("The lion walks on 4 legs");
    }
    public void eat(){
        System.out.println("It is carnivorous");
    }
} 
public class interfaces {
    public static void main(String[] args) {
        lion l = new lion();
        l.walk();
        l.eat();
    }
}
