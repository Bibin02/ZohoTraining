/*
6(L2).Reverses the ArrayList A
*/public class D4T3Q6 {
    public static void main(String[] args) {
        MyArrayList1 ar = new MyArrayList1(10);

		ar.display();

		ar.rev();

		ar.display();
    }
}
class MyArrayList1{
	private int[] array; 
	MyArrayList1(int size){
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

    void rev(){
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            // Swap
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
    }
}