/*
3.(L2)Write a program to get the reference to the current thread by calling currentThread() method.
 */
public class D5T3Q3 extends MyThread2{
	public static void main(String[] args) {
        String threadname = Thread.currentThread().getName();
        System.out.println(threadname);
		Thread t = new MyThread2();
		t.start();
		
    }
    
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}