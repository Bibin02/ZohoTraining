/*
3(L2).Write a program that would print the information 
(name, year of joining, salary, address) of three employees by creating a class named 'Employee'. 
The output should be as follows:

*/
public class D2T2Q3 {
public static void main(String[] args) {
Employee[] employees = new Employee[3];
// Data Stored in Array.
String[] names = new String[]{"Ashwin", "Robert", "John"};
String[] addrs = new String[]{"64C- WallsStreat", "64D- WallsStreat", "64E- WallsStreat"};
int[] YOJs = new int[]{1994, 2000, 1999};

// Inserting
for (int i = 0; i < employees.length; i++) {
employees[i] = new Employee(names[i],YOJs[i],addrs[i]);
}
// Printing
System.out.println("Name\tYear of Joining\t\tAddress");
for (int i = 0; i < employees.length; i++) {
System.out.println(employees[i].name+"\t\t"+employees[i].YOJ+"\t\t"+employees[i].addr);
}
}

}

class Employee{
String name;
int YOJ;
String addr;

Employee(String name, int YOJ, String addr){
this.name = name;
this.YOJ = YOJ;
this.addr = addr;
}

}