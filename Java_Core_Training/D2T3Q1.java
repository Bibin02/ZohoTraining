/*
Task 3 (Inheritance)

1(L1).Write a program for demonstrating Multiple Inheritance in java 

(Using Interface)
*/
public class D2T3Q1 implements MARKER_INTERFACE, INTERFACE3{
public static void main(String[] args) {
D2T3Q1 obj = new D2T3Q1();
obj.meth1();
obj.meth2();
obj.meth3();
}
// All abstract methods in the interface should be overrided in implemented class
// Should have a greater visibility than overridden methods

@Override // Annotation mentioning or indicating that this method is overrided
public void meth1(){
System.out.println("I'm method 1");
}
public void meth2(){
System.out.println("I'm method 2");
}
public void meth3(){}
}

interface MARKER_INTERFACE extends INTERFACE1, INTERFACE2{

}

interface INTERFACE1 {
// All methods are abstract methods
void meth1();

}

interface INTERFACE2 {
void meth2();
}

interface INTERFACE3 {
void meth3();
}

