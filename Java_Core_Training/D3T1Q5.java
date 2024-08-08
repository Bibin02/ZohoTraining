/*
5(L3).Write a simple ticket booking system using polymorphism in Java
*/
public class D3T1Q5 {
    public static void main(String[] args) {

        // Dynamically allocating the ticket type
        // Bus
        Ticket tk1 = new Bus();
        tk1.bookTicket();

        // Train
        Ticket tk2 = new Train();
        tk2.bookTicket();
        tk2.bookTicket(5);

        // Unspecified
        Ticket tk3 = new Ticket();
        tk3.bookTicket();
    }
}

class Ticket{
    void bookTicket(){
        System.out.println("Ticket booked");
    }
    // Overloading the bookTicket method
    void bookTicket(int count){
        System.out.println(count+" Tickets booked");
    }
}

class Bus extends Ticket{
    @Override
    void bookTicket(){
        System.out.println("Bus Ticket booked");
    }
}

class Train extends Ticket{
    @Override
    void bookTicket(){
        System.out.println("Train Ticket booked");
    }
}