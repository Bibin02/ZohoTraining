/*
3(L3).We have to calculate the percentage of marks obtained in three subjects 
(each out of 100) by student A and in four subjects (each out of 100) by student B. 
Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' 
each having a method with the same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters 
and the marks in four subjects as its parameters for student B. 
Create an object for each of the two classes and print the percentage of marks for both the students.
*/
public class D3T2Q3 {
    public static void main(String[] args) {
        // Student A
        Marks p1 = new StudentA(88, 98, 100);
        System.out.println(p1.getPercentage());

        // Student B
        Marks p2 = new StudentB(80, 88, 100, 100);
        System.out.println(p2.getPercentage());
    }
}

abstract class Marks {
    abstract float getPercentage();
}

class StudentA extends Marks{
    int m1, m2, m3;
    StudentA(int m1, int m2, int m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    float getPercentage(){
        return (m1 + m2 + m3) / 3;
    }
}

class StudentB extends Marks{
    int m1, m2, m3, m4;
    StudentB(int m1, int m2, int m3, int m4){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
    }
    float getPercentage(){
        return (m1 + m2 + m3 + m4) / 4;
    }
}