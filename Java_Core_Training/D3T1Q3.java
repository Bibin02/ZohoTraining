/*
3(L1).Can we prevent overloading? if yes code it and explain it
*/
public class D3T1Q3 {

    /*
    We can't directly achieve the prevention o overloading 
    but through restrictions through access modifiers.
    */

    // Main methods can be overloaded to have multiple ones.
    // JVM needs the appropriate main method only.
    public static void main(int a) {
        
    }
    public static void main(String[] args) {
        D3T1Q3_2 obj = new D3T1Q3_2();
        // Overloading prevented due to access restrictions
        obj.method1();
        // obj.method1(0);
    }
}
class D3T1Q3_2 {
    void method1(){
        System.out.println("I'm method 1 with no arguments");
    }
    // Since private methods are not visible to the outside of the class this method can't be utilized thereby prevention is achieved.
    // Annotation for suppressing the warning messages.
    @SuppressWarnings("unused")
    private void method1(int status){
        System.out.println("I'm method 1 with argument status");
    }
}