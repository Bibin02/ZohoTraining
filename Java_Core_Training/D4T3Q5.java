/*
5(L1).Sorts the ArrayList A in ascending order
*/

public class D4T3Q5 {
    public static void main(String[] args){
		
		MyArrayList ar = new MyArrayList(10);

		ar.display();

		ar.sort();

		ar.display();

	}
}

class MyArrayList{
	private int[] array; 
	MyArrayList(int size){
		this.array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
	}
	
	void sort(){
		// Bubble sort
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					// Swap
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}
	
	void display(){
		for (int i : array) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
}