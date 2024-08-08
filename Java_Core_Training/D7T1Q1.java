/*
Task 1 (Singleton Class)
1.Create a singleton class by using getInstance() method.
*/
public class D7T1Q1 {
    public static void main(String[] args) {

        Singleton1 sobj1 = Singleton1.getInstance();
        sobj1.printer();

        Singleton1 sobj2 = Singleton1.getInstance();
        sobj2.printer();
    }
}

class Singleton1{
    private static Singleton1 instance;

    // Can't Instantiate if constructor is private.
    private Singleton1(){}

    static Singleton1 getInstance(){
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    void printer(){
        System.out.println("Printing the Object Hashcode :"+this.hashCode());
    }

}
