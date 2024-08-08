/*
1(L1).Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/
public class D2T2Q1 {
public static void main(String[] args) {
Student1 st1 = new Student1("John", 2);
System.out.println(st1.name);
System.out.println(st1.roll_no);
}
}

class Student1 {

String name;
int roll_no;

Student1(String name, int roll_no){
this.name = name;
this.roll_no = roll_no;
}
}
