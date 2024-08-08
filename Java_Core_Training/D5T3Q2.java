/*
2. ((L2)Write a program to create a class MyThread in this class a constructor, 
call the base class constructor, using super and starts the thread. 
The run method of the class starts after this. 
It can be observed that both the main thread and created child thread are executed concurrently.
 */

public class D5T3Q2{
    public static void main(String[] args) {
		// MyThread
		Thread t = new MyThread1();
        t.start();
		// Main Thread
		for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread "+i+"executing");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        
    }
    
}
class MyThread1 extends Thread{
	MyThread1(){
		super();
	}
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread "+i+"executing");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    
}