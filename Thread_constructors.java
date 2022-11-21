// All thyes of constructors in threads
//      1. Thread()
//      2. Thread(Name)
//      3. Thread(Runnable r)
//      3. Thread(Runnable r ,  name)



class mythread extends Thread{
    public mythread(String Name){  // Is needed to create a thread with a provided name 
        super(Name);  //calls the upper thread constructor of the actual thread class 
    }
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Thread is running");
            i++;
        }
    }
}

class mythread2 extends Thread{
    public mythread2(Runnable r ,String Name){  // Is needed to create a thread with a provided name 
        super(r,Name);  //calls the upper thread constructor of the actual thread class 
    }
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Thread is running");
            i++;
        }
    }
}

class myrunnable implements Runnable{
    public void run(){
        System.out.println("This the runnable interface");
    }
}
public class Thread_constructors {
    public static void main(String[] args) {
        mythread m = new mythread("Souvik");  // Specifiy name while creating a thread in the constructor of thread 
        m.start();  //Starts the thread 
        System.out.println("The id of the thread is "+m.getId());  // Prints the id of thread
        System.out.println("The name of the thread is "+m.getName());  //Prints the given name of the thread
        
        
        myrunnable r = new myrunnable();  // Creating the object of a extended runnable interface
        
        mythread2 m2 = new mythread2(r, "Souvik2");  // Entering the runnable object and the thread name into the constructor
        m2.start(); //Starts the secind thread 
        System.out.println("The id of the thread is "+m2.getId());  // Prints the id of thread
        System.out.println("The name of the thread is "+m2.getName());  //Prints the given name of the thread
    }
}