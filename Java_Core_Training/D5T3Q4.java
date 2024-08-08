/*
4.(L3)Write a program to create two threads. 
In this class we have one constructor used to start the thread and run it. 
Check whether these two threads are run are not.
 */
public class D5T3Q4 {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        if (t1.isAlive()) {
            System.out.println("Thread 0 is running");
        }
        MyThread3 t2 = new MyThread3();
        if (t2.isAlive()) {
            System.out.println("Thread 1 is running");
        }
    }
    
}

class MyThread3 extends Thread{
    MyThread3(){
        this.start();
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }
    }
}