//Write a program to print Good morning and welcome simultaneously 
// Add a sleep method of 200 ms in welcome object. 
//Demonstrate getpriority() and setpriority() in java.
//How do you get state of a given thread in java ? 
//How do you get refrence to the current thread in java ? 



class Goodmrng extends Thread{
    public void run(){
        System.out.println("Good morning !");
    }
}
class wel extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome !");
    }
}
public class Practise_java_thread {
    public static void main(String[] args) {
        Goodmrng gm = new Goodmrng();
        wel w = new wel();
        gm.setPriority(Thread.MAX_PRIORITY);
        w.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println("The priority of goodmorning is "+gm.getPriority());
        System.out.println("The priority of welcome is "+w.getPriority());

        System.out.println("The current state of the good morning thread is "+gm.getState());
        System.out.println("The current state of the welcome thread is "+w.getState());

        System.out.println("The current state of the current thread is "+ Thread.currentThread().getState());

        gm.start();
        w.start();
    }
} 

