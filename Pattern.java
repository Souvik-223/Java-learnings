public class Pattern {
    public static void main(String[] args) {
        //Upper diamond
        for (int i = 0; i < 5; i+=2) {
            for (int j = 5; j>i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");   
            }
            System.out.println();
        }

        //Lower diamond
        for (int i = 3; i > 0; i-=2) {
            for (int j = 5; j>=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");   
            }
            System.out.println();
        }
    }

}
