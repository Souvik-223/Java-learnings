class mythread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I am thread 1");
            i++;
        }
    }
}
class mythread2 implements Runnable{
    public void run(){
        int i =0;
        while(i<1000){
        System.out.println("I am thread 2");
        i++;
        }
    }
}

public class Implementing_Runnable_Interfaces {
    public static void main(String[] args) {
        mythread1 m1 = new mythread1();
        mythread2 m2 = new mythread2();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();

    }
}
