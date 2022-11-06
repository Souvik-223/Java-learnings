import java.math.*;
import java.util.*;

import javax.sql.StatementEventListener;

public class tut8 {
    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static int sumodd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }

    public static int compare(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 1;
        }
    }

    public static double circumference(Float r) {
        double circum = (6.28 * r);
        return circum;
    }

    public static void vote(int age) {
        if (age > 18) {
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
        } else if (age < 18) {
            System.out.println("You are not eligible to vote ");
        } else {
            System.out.println("Please provide the correct age");
        }
        return;
    }

    public static int power(int x, int n){
        return (int)Math.pow(x, n);
    }

    public static int commondivisor(int a,int b){
        int gcd= 1;
        for (int i = 1; i <= a&&i<= b; i++) {
            if (a%i==0 && b%i==0 ) {
                gcd=i;
            }
        }
        System.out.println("The greatest common divisor of "+a+" and "+b+" is- "+gcd);
        return gcd;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1- enter 3 numbers from the user and make a function to print their
        // avarage
        // Ans:-
        // System.out.println("Enter 3 numbers to get the average of:-");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        // System.out.println("The average of the three numbers is "+average(a, b, c));



        // Question 2- Write a function to print the sum of all odd numbers from 1 to n.
        // Ans:-
        // System.out.println("Enter the number to print the sum of all odd numbers
        // upto");
        // int n =sc.nextInt();

        // System.out.println("The sum for all odd numbers upto "+n+" is- "+sumodd(n));



        // Question 3- Write a function which takes two numbers and return the greater
        // pf the two.
        // Ans:-
        // System.out.println("Enter the two numbers to compare-");
        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // System.out.println("The greater of the two numbers is "+compare(a, b));



        // Question 4- Write a function which takes two numbers and return the greater
        // of the two.
        // Ans:-
        // System.out.println("Enter the radius of the circle-");
        // float radius=sc.nextInt();

        // System.out.println("The circumference of the circle is
        // "+circumference(radius));
        // }



        // Question 5- Write a function that takes the age as an inout and returns if
        // that person is eligible to vote or not.
        // Ans:-
        // System.out.println("Enter your age-");
        // int age=sc.nextInt();
        // vote(age);



        // Question 6- Write an infinite loop using do while condition.
        // Ans:-
        // int infinite=30;
        // do {
        // System.out.println("Infinite");
        // } while (infinite>10);
        // }



        // Question 7- Write a program to enter the numbers till the user wants and at
        // the end it shoud display the count of positive, negative and zeros entered.
        // Ans:-
        // System.out.println("Enter the number of times you want to enter digits-");
        // int n = sc.nextInt();
        // int a, positive = 0, negative = 0, zeros = 0;
        // System.out.println("Enter all the numbers you want-");

        // for (int i = 0; i < n; i++) {
        //     a = sc.nextInt();
        //     if (a < 0) {
        //         negative++;
        //     } else if (a > 0) {
        //         positive++;
        //     } else if (a == 0) {
        //         zeros++;
        //     }
        // }
        // System.out.println("The number of positives are " + positive + " The number of negatives are " + negative
        //         + " The number of zeroes are " + zeros);




        // Question 8- Two numbers are Enterd by the user x and n. Write a function to
        // find the value of one number raised to the power of another i.e x^n.
        // Ans:-
        // System.out.println("Enter two numbers- ");
        // int x=sc.nextInt();
        // int n=sc.nextInt();
        
        // System.out.println("The number x to the power of n is "+power(x,n));



        // Question 9- Write a function that calculates the greatest common divisor of 2
        // numbers.
        // Ans:-
        // System.out.println("Enter the two numbers to get the greatest common divisor-");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // commondivisor(a,b);

        // Question 10- Write a program to print Fibonacci series of n terms where n is
        // input by user
        // 0,1,1,2,3,5,8,13,21,.......
        // In fibonacci series a number is the som of previous 2 numbers that came
        // before it
        // Ans:-
        // System.out.println("Enter the number to print the fibonacci series upto-");
        // int n = sc.nextInt();
        // int num1=0;
        // int num2=1;
        // int num3=0;
        // System.out.print(num1);
        // System.out.print(" "+num2);
        // for (int i = 0; i <=n; i++){
        //     num3= num1+num2;
        //     System.out.print(" "+num3);
        //     num1=num2;
        //     num2=num3;
        // }
    }
        
}

