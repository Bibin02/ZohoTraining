/*
1(L1).Write a program for dynamic binding and static binding in Java
*/
public class D3T1Q1 extends Parent1{
    void method(){
        System.out.println("Child class/Subclass method");
    }
    
    void method(int status){
        System.out.println("Child/Subclass method with status code :"+status);
    }
    public static void main(String[] args) {

        // Dynamic Binding , Example method overriding -> Runtime polymorphism
        // Upcasting the object
        Parent1 obj1 = new D3T1Q1();
        // Dynamically selecting which method to execute.
        // Super class Parent method "method" is overrided by the Sub class method "method"
        obj1.method();
        // obj1.method(1); This is not possible since obj1 is Parent class reference and cant access child class method.

        // Static binding , Example method overloading -> Compile Time Polymorphism
        D3T1Q1 obj2 = new D3T1Q1();
        obj2.method();
        obj2.method(1);
        
    }
}

class Parent1{
    void method(){
        System.out.println("Parent/Super class method");
    }
}

