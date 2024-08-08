/* 
4(L1) Create an Instance Initializer block and explain the relation between Instance Inititilizer block with constructor
*/
public class D3T1Q4 {

    int a; // Primitives have their respective default values when initialized as an instance variable.
    String b; // For Objects, null is assigned as default value.

    // Instance initializer block for the class D3T1Q4
    {
        // Used to initialize instance variables and objects.
        a = 100;
        b = "AAA";
        System.out.println(a+b+" Executed First");
        
    }
    // Constructor for the class D3T1Q4
    D3T1Q4(){
        this.a = 200;
        this.b = "BBB";
        System.out.println(a+b+" Executed second");
    }
    public static void main(String[] args) {
        // Before the constructor is called, the instance initializer block executes first.
        D3T1Q4 obj = new D3T1Q4();
        obj.a = 0;
    }
}
