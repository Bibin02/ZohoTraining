/*
2(L1).Can we prevent overriding? if yes code it and explain it
*/
public class D3T1Q2 extends Parent2{

    /* We can prevent overriding by using final keyword in the Superclass method.
     * We can prevent inheriting by using final keyword in class definition.
    */
    @Override
    void method3(){
        System.out.println("I'm from Child Class normal method \"method3\"");
    }

    // @Override 
    // Override annotation throws error for static methods. Overloading of static methods is illogical 
    // because static methods are not object dependent.
    static void method1(){
        System.out.println("I'm from Child Class static method \"method1\"");
    }

    // We cant't Override final methods. 
    // @Override
    // final void method2(){
    //     System.out.println("I'm from Child Class final method \"method1\"");
    // }
    public static void main(String[] args) {
        Parent2 obj = new D3T1Q2();
        // parent class method2 is called.
        Parent2.method1();
        // Child class method2 is called.
        method1();
        // Parent class final method "method2" is called because we can't override final methods
        obj.method2();
        // Overriding Happens and calls "method3" in Subclass(D3T1Q1) class
        obj.method3();
    }
}

class Parent2{
    static void method1(){
        System.out.println("I'm from Parent Class static method \"method1\"");
    }

    final void method2(){
        System.out.println("I'm from Parent Class final method \"method2\"");
    }

    void method3(){
        System.out.println("I'm from Parent Class normal method \"method3\"");
    }
}
