import java.util.*;

class commision {
  int sales;
  commision(int sales){
    // Example commmision is 10 %
    int com =  sales / 10;
    System.out.println("The commision rate is "+com);
  }
}
//Develpped by souvik chakraborty
public class q_1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
    System.out.println("Enter the Sale this time:");
    int sales = sc.nextInt();
      if (sales < 0 ) {
        System.out.println("Invalid input");
        System.out.println("The entered value is negative , enter again");
      }
      else {
        commision cs = new commision(sales);
      }
    }
  }
  
}