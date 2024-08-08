/*
4(L2).Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" 
and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. 
Now create an object for each of the subclasses and call their respective methods.
*/
public class D3T2Q4 {
    public static void main(String[] args) {
        // Animal -> Cat
        Animals a1 = new Cats();
        a1.cats();
        a1.dogs();

        // Animal -> Dog
        Animals a2 = new Dogs();
        a2.dogs();
        a2.cats();
    }
}

abstract class Animals {
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{
    void cats(){
        System.out.println("Cats Meow");
    }

    void dogs(){
        System.out.println("Cats only Meow");
    }
    
}

class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs Bark");
    }
    void cats(){
        System.out.println("Dogs only Bark");
    }
}
