class mythreadx extends Thread{
    public void run(){
        System.out.println("This thread is running");
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        mythreadx m1 = new mythreadx();
        mythreadx m2 = new mythreadx();
        mythreadx m3 = new mythreadx();
        
        m1.setPriority(Thread.MAX_PRIORITY);  // Sets the priority to the maximum
        m2.setPriority(Thread.MIN_PRIORITY);  // Sets the priority to the miniumum
        
        m1.start();  // max
        m2.start();  // min
        m3.start();  // Normal
    }
}
