/*
5(L3).Assign and print the roll number, phone number and address of two students 
having names "Sam" and "John" respectively by creating two objects of class 'Student'.
*/
public class D2T2Q5 {
public static void main(String[] args) {
Student[] students = new Student[5];
// Data Stored in Array.
String[] names = new String[]{"Ashwin", "Robert", "John", "Kumar", "Sam"};
String[] addrs = new String[]{"64C- WallsStreat", "64D- WallsStreat", "64E- WallsStreat", "64F- WallsStreat", "64G- WallsStreat"};
int rolls = 1001, phs = 1230001;

// Inserting
for (int i = 0; i < students.length; i++) {
students[i] = new Student(names[i],rolls++,phs++,addrs[i]);
}

// Query
names = new String[]{"Sam", "John"};
for (Student student : students) {
for (int i = 0; i < names.length; i++) {
if (student.name == names[i]) {
student.display();
}
}
}
}

}
class Student {
String name;
int roll;
int ph;
String addr;

Student(String name, int roll, int ph, String addr){
this.name = name;
this.roll = roll;
this. ph = ph;
this.addr = addr;
}

void display(){
System.out.println(this.roll+"\t"+this.ph+"\t"+this.addr);
}
}