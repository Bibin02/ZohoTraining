/*
10(L1).Implement Map using Java 
*/
public class D4T3Q10 {
    public static void main(String[] args) {
		MyMap mp = new MyMap(10);
		
		// Insert Values.
		mp.put("AAA", 200);
		mp.put("BBB", 120);
		mp.put("CCC", 300);
		mp.put("DDD", 190);
		
		// Information retrieval
		mp.get("BBB");
		mp.display();
		
		// Update
		mp.put("DDD", 1000);
		mp.display();
		
		// Delete
		mp.delete("BBB");
		mp.display();
		
		// Update Key
		mp.updateKey("DDD", 444);
		
		//Final display
		mp.display();
		
	}
}

class MyMap{
	private String[] keys;
	private String[] values;
	private int top = -1;
	
	MyMap(int size){
		this.keys = new String[size];
		this.values = new String[size];
	}
	
	void get(Object key){
		for (int i = 0; i <= top; i++) {
			if (key.toString() == keys[i]) {
				System.out.println(values[i].toString());
			}
		}
	}
	
	// Can be used to update value in Map.
	void put(Object key, Object value){
		if (top == keys.length){
			System.out.println("Map full");
			return;
		}
		boolean flag = false;
		for (int i = 0; i <= top; i++) {
			if (key.toString() == keys[i]) {
				values[i] = value.toString();
				System.out.println("Updated sucessfully");
				flag = true;
			}
		}
		if(!flag){
			this.top++;
			keys[this.top] = key.toString();
			values[this.top] = value.toString();
			System.out.println("Inserted sucessfully");
		}
	}
	
	void delete(Object key){
		boolean flag = false;
		for (int i = 0; i <= top; i++) {
			if (key.toString() == keys[i]) {
				deleteElement(i);
				System.out.println("Deleted sucessfully");
				flag = true;
			}
		}
		if(!flag){
			System.out.println("Unable to find");
		}
	}
	
	private void deleteElement(int index) {
		// Swapping logic.
        for (int i = index; i < top; i++) {
            // Swapping
            keys[i] = keys[i+1];
			values[i] = values[i+1];
        }
        top--;
	}

	// Can be used to update value in Map.
	void updateKey(Object key1, Object key2){
		boolean flag = false;
		for (int i = 0; i <= top; i++) {
			if (key1.toString() == keys[i]) {
				keys[i] = key2.toString();
				System.out.println("Updated sucessfully");
				flag = true;
			}
		}
		if(!flag){
			System.out.println("Unable to find");
		}
	}
	
	// Display
	void display(){
		for (int i = 0; i <= top; i++) {
			System.out.println(keys[i]+" -> "+values[i]);
		}
		System.out.println("\n");
	}
	
	
}