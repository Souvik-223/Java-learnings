import java.util.*;

public class tut12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:- ");
        String name = sc.nextLine();

        // Using charAt() function with strings

        System.out.println("String in vertical order:- ");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        // Using compareTo() function with strings

        System.out.println("Enter your name again");
        String name2 = sc.nextLine();

        if (name.compareTo(name2) == 0) {
            System.out.println("You enterd your name correctly :- Noice");
        } else {
            System.out.println("You enterd wrong name:- ");
        }

        // Using Substring() function with strings

        System.out.println( "Do you want to bring a part of your name. Then we need the Indexes so Input index (Start and end):- ");
        int a = sc.nextInt() - 1;  // Start index
        int b = sc.nextInt() + 1;  // End index

        String New = name.substring(a,b);
        System.out.println(New);

    }
}
