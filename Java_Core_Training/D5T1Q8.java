/*
(L1)Write a program to illustrate how to throw an ArrayOutOfBoundException.
*/
public class D5T1Q8 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
			for (int i = 0; i < 100; i++){
				if (i < arr.length){
					arr[i] = i;
				}
				else
					throw new ArrayIndexOutOfBoundsException();
			}
        } catch (ArrayIndexOutOfBoundsException aioe) {
            System.out.println("ArrayOutOfBound Exception thrown");
        }
    }
}
