/*
4(L3).Make a searching, inserting, deleting and updating operation in Linked list
 */
public class D4T3Q4 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
		// Inserting elements
		ll.insert(100);
		ll.insert(140);
		ll.insert(160);
		ll.insert(120);
		
		// Searching
		ll.search(24);
		ll.search(100);
		
		// Deleting
		ll.delete(140);
		
		// DisplayMode
		ll.display();
		
		// Update
		ll.update(120, 200);
		
		// DisplayMode
		ll.display();

    }
}

class MyLinkedList{
	int data;
	MyLinkedList next;
	
	MyLinkedList(){	}
	
	MyLinkedList(int val){
		this.data = val;
		this.next = null;
	}
	
	void insert(int val){
		MyLinkedList temp = this;
		// Traverse till end
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new MyLinkedList(val);
	}
	
	void update(int val1, int val2){
		MyLinkedList temp = this;
		// Traverse till finding
		while(temp.data != val1 && temp != null){
			temp = temp.next;
		}
		if (temp == null){
			System.out.println("Not found");
			return;
		}
		temp.data = val2;
	}
	
	void search(int val){
		MyLinkedList temp = this;
		int count = 0;
		// Traverse till finding
		while(temp.data != val && temp.next != null){
			temp = temp.next;
			count++;
		}
		if (temp.data != val){
			System.out.println("Not found");
			return;
		}
		System.out.println("Found at index : "+count);
	}
	
	void delete(int val){
		MyLinkedList temp = this;
		// Delete root.
		if (temp.data == val){
			System.out.println("Can't Delete Root node, create new root for operations.");
			return;
		}
		// Traverse till finding
		while(temp.next.data != val && temp.next != null){
			temp = temp.next;
		}
		if (temp.next == null){
			System.out.println("Not found");
			return;
		}
		// Delete node
		temp.next = temp.next.next;
	}
	
	void display(){
		MyLinkedList temp = this;
		System.out.print("[");
		while(temp.next != null){
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
		System.out.println("]");
	}
}