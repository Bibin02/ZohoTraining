/*
Task 1(Control Structures)
1(L2).Write a Java program to solve quadratic equations (use if, else if and else).
*/
public class D2T1Q1 {
public static void main(String[] args) {
// aX^2 + bX + c

// Primary School method.
int a = 2, b = 5, c = 3;
// 2X^2 + 5X + 6.

int prod = a * c;
int sum = b;
boolean found = false;

// We can also use Optimized way through finding factors and use them.
for (int i = 1; i <= prod; i++) {
for (int j = 1; j <= prod; j++) {
if ( (i*j == prod) && (i+j == sum) ){
System.out.println(i+"/"+a+" "+j+"/"+a);
found = true;
break;
}
}
if (found) {
break;
}
}

}
}
