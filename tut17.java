public class tut17 {
    public static void printsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println("The sum of n natural numbre is " + sum);
            return;
        }
        sum = +i;
        printsum(i + 1, n, sum);
    }

    public static void printfact(int n, int fact) {
        if (n == 1) {
            fact *= n;
            System.out.println("The factorial of n is " + fact);
            return;
        }
        fact *= n;
        printfact(n - 1, fact);
    }

    public static void printfib(int a, int b, int c, int end) {
        if (c >= end) {
            return;
        }
        c = a + b;
        a = b;
        b = c;
        System.out.print(c + " ");
        printfib(a, b, c, end);
    }

    public static int powern(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xm_1 = powern(x, n-1);
        int power=x*xm_1;
        return power;
    }

    public static int logn(int x, int n){
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        //if n is even 
        if (n%2==0) {
            return logn(x, n/2) * logn(x, n/2);
        } 
        else { // If n is odd
            return logn(x, n/2) * logn(x, n/2) * x;;
        }
        
    }

    public static void main(String[] args) {
        // Print sum of first n natural number
        // printsum(1, 5, 0);

        // Print factiorial of a number n
        // printfact(3, 1);

        // print the fibonacci sequence till nth term
        // int a=0;
        // int b=1;
        // System.out.print(a+" ");
        // System.out.print(b+" ");
        // printfib(a, b, 0,100);

        // print x^n (Stack height = n)
        // int x = 8;
        // int n = 10;
        // System.out.println(powern(x, n));

        //print x^n (stack height = logn)
        int n = 10;
        int x = 8;
        System.out.println(logn(x, n);); 

    }
}
