/*
1. (L2)Write a program to illustrate creation of threads using runnable class.
(start method start each of the newly created thread. 
Inside the run method there is sleep() for suspend the thread for 500 milliseconds).
 */

public class D5T3Q1 extends runnable{
    public static void main(String[] args) {
        Thread t = new runnable();
        t.start();
    }
    
}
class runnable extends Thread{

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