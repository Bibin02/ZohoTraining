/*
9(L1).Make a searching, inserting, deleting and updating operation in Stack and Queue data structures.
 */
public class D4T3Q9 {
    public static void main(String[] args) {
        MyStack stk = new MyStack(10);
        MyQueue que = new MyQueue(10);
		
		// Stack Operations.
        // push
		stk.push(0);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        // Initial display
        stk.display();
		
        // Removal
        stk.pop();
        stk.pop();

        stk.display();

        // updation
        stk.update(0, 10);

        // Final Display
        stk.display();

		// Queue Operations
        // Enqueue
        que.enqueue(0);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);

        // Initial display
        que.display();

        que.dequeue();
        que.dequeue();

        que.display();

        // Update
        que.update(2, 100);

        // Final display
        que.display();



    }
}

class MyStack{
	private int[] array; 
    private int top = -1;
	MyStack(int size){
		this.array = new int[size];
	}

    void push(int v){
        if (this.top == array.length) {
            System.out.println("Stack full");
            return;
        }
        array[++this.top] = v;
        System.out.println("Inserted into stack");
    }

    void pop(){
        if (this.top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        this.top--;
        System.out.println("popped out of stack");
    }

    void search(int v){
		boolean flag = false;
        for (int i = 0; i <= top; i++) {
            if (array[i] == v) {
                System.out.println("Found at "+i);
            }
        }
		if(!flag){
			System.out.println("Unable to find");
		}
    }

    void update(int v1, int v2){
		boolean flag = false;
        for (int i = 0; i <= top; i++) {
            if (array[i] == v1) {
                System.out.println("Updated at "+i);
                array[i] = v2;
				flag = true;
            }
        }
		if(!flag){
			System.out.println("Unable to find");
		}
    }
    void display(){
		for (int i : array) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
}

class MyQueue{
	private int[] array; 
    private int end;
	MyQueue(int size){
		this.array = new int[size];
	}
    void enqueue(int v){
        if (this.end == array.length) {
            System.out.println("Queue full");
            return;
        }
        array[this.end++] = v;
        System.out.println("Inserted into Queue");
    }

    void dequeue(){
        if (end == -1) {
            System.out.println("Queue Empty");
            return;
        }
        // Swapping logic.
        for (int i = 0; i < end; i++) {
            // Swapping
            array[i] = array[i+1];
        }
        end--;
    }

    void search(int v){
		boolean flag = false;
        if (end == -1) {
            System.out.println("Queue Empty");
            return;
        }
        for (int i = 0; i <= end; i++) {
            if (array[i] == v) {
                System.out.println("Found at "+i);
				flag = true;
            }
        }
		if(!flag){
			System.out.println("Unable to find");
		}
        
    }

    void update(int v1, int v2){
		boolean flag = false;
        for (int i = 0; i <= end; i++) {
            if (array[i] == v1) {
                System.out.println("Updated at "+i);
                array[i] = v2;
				flag = true;

            }
        }
		if(!flag){
			System.out.println("Unable to find");
		}
    }
    void display(){
		for (int i : array) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
}
