/*
2(L1).Write a program to print the area of two rectangles 
having sides (4,5) and (5,8) respectively by creating a class 
named 'Rectangle' with a method named 'Area' 
which returns the area and length and breadth passed as parameters to its constructor.
*/
public class D2T2Q2 {
public static void main(String[] args) {
Rectangle rt1 = new Rectangle(4, 5);
Rectangle rt2 = new Rectangle(5, 8);

rt1.area();
rt2.area();
}

}
class Rectangle{

int length;
int breadth;

Rectangle(int l, int b){
this.length = l;
this.breadth = b;
}

void area(){
System.out.println("Length : "+this.length);
System.out.println("Breadth : "+this.breadth);
System.out.println("Area : "+this.length*this.breadth);
}
}
