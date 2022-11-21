class Mythread extends Thread{
    public void run(){
        System.out.println("The thread is running");
    }
}
public class Thread_Methods{
    public static void main(String[] args) {
    Mythread m1 = new Mythread();
    m1.start(); //This methid starts the thread into running
    m1.getId(); //Gives the id of the thread 
    m1.getPriority(); //Gives the priority of the thread 
    try {
        m1.sleep(500);  //Puts the thread in sleep for certain time 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    try {
        m1.join();  // Joins two threads and only after the completeion of the thread called first will the second thread run. 
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
} 