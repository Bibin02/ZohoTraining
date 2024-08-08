/*
6.(L3)Create a multithreaded program as in the previous exercise by creating the MyThread subclass of Thread. 
But create threads as objects of the class MyClass, which is not a subclass of Thread. 
MyClass will implement the runnable interface and objects of MyClass will be executed as threads by passing them as arguments to the Thread constructor.
*/
public class D5T3Q6 implements Runnable {
    private String printable;

    public D5T3Q6(String printable) {
        this.printable = printable;
    }

    public void run() {
        System.out.println(this.printable);
    }

    public static void main(String[] args) {
        // Creating threads using MyClass as Runnable
        D5T3Q6 thread1 = new D5T3Q6("Java is Hot");
        D5T3Q6 thread2 = new D5T3Q6("Java is aromatic");
        D5T3Q6 thread3 = new D5T3Q6("Java is invigorating to the console window");


        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // Thread execution Initiation.
        t1.start();
        t2.start();
        t3.start();

        // Main is Busy (Assumed) as usual
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            
        }
    }
}
