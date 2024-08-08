/*
5.(L3)Create a multithreaded program by creating a subclass of Thread 
and then creating, initializing, and staring two Thread objects from your class. 
The threads will execute concurrently and display Java is hot, aromatic, and invigorating to the console window.
 */
public class D5T3Q5 {
    public static void main(String[] args) throws InterruptedException{
        MyThread4 t1 = new MyThread4("Java is Hot");
        MyThread4 t2 = new MyThread4("Java is aromatic");
        MyThread4 t3 = new MyThread4("Java is invigorating to the console window");

        // Thread execution initiation.
        t1.start();
        t2.start();
        t3.start();

		// Main is Busy (Assumed)
        Thread.sleep(2000);
    }
    
}

class MyThread4 extends Thread{
	private String printable;
	
    MyThread4(String printable){
        this.printable = printable;
    }
    @Override
    public void run() {
        System.out.println(printable);
    }
}