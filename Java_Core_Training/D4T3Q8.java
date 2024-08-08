/*
8(L2).Prints space separated values of the ArrayList

*/
public class D4T3Q8 {
    public static void main(String[] args) {
        MyArrayList2 ar = new MyArrayList2(10);
		ar.display();
    }
}
class MyArrayList2{
	private int[] array; 
	MyArrayList2(int size){
		this.array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
	}

    void display(){
		for (int i : array) {
			System.out.print(i+", ");
		}
		System.out.println();
	}

}