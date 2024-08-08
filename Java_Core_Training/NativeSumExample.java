public class NativeSumExample {

    static {
        try {
            System.loadLibrary("native_sum"); // Load the native library
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native library not found or could not be loaded: " + e.getMessage());
            System.exit(1);
        }
    }

    // Native method declaration
    public native int sumArray(int[] arr);

    public static void main(String[] a ) {
        NativeSumExample example = new NativeSumExample();
        int[] array = {1, 2, 3, 4, 5};
        int sum = example.sumArray(array); // Call the native method
        System.out.println("Sum of array elements: " + sum);
        
        NativeSumExample n = new NativeSumExample();
        n.test();
        //NativeSumExample1 n = new NativeSumExample1();
       // main2();
       //int a[7];
       int[] h = {8,7,9};
       for (int i = 0; i < h.length; i++) {
        System.out.println(i);
       }
        
    }

    public  void test(){
        
    }
}

class NativeSumExample1 {



    public static void main2() {
       
        System.out.println("Sum of array elements: ");
        
        
    }


}

