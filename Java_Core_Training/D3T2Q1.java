/*
1(L1).Create an abstract class 'Parent' with a method 'message'. 
It has two subclasses each having a method with the same name 'message' 
that prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.
*/
public class D3T2Q1 {
    public static void main(String[] args) {
        AbstractParent obj1 = new Subclass1();
        AbstractParent obj2 = new Subclass2();

        obj1.message();
        obj2.message();
    }
}

abstract class AbstractParent {
    abstract void message();
}

class Subclass1 extends AbstractParent{
    void message(){
        System.out.println("This is first subclass");
    }
}

class Subclass2 extends AbstractParent{
    void message(){
        System.out.println("This is second subclass");
    }
    
}