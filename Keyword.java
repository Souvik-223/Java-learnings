class one{
    int a = 10;
    int b = 5;
    one( int x){
        this.b = x;
        System.out.println(this.a);
    }

}

class two extends one {
    two(int x , int y){
        super(x);
        System.out.println("the vale of a is "+this.a+"The vale of b is "+this.b);
    }
}

public class Keyword {
    public static void main(String[] args) {
        System.out.println("This is a wonderful day");
        two x = new two(4,6);
    }
}
