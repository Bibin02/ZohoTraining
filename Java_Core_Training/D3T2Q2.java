/*
2(L2).Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
Call this method by creating an object of each of the three classes.
*/
public class D3T2Q2 {
    public static void main(String[] args) {
        // For Bank A Balance.
        Bank a = new BankA(100);
        System.out.println(a.getBalance());

        // For Bank B Balance.
        Bank b = new BankB(150);
        System.out.println(b.getBalance());

        // For Bank C Balance.
        Bank c = new BankC(200);
        System.out.println(c.getBalance());
    }
}

abstract class Bank {
    int balance;
    abstract int getBalance();
}

class BankA extends Bank{
    BankA(int balance){
        super.balance = balance;
    }
    int getBalance(){
        return balance;
    }
}

class BankB extends Bank{
    BankB(int balance){
        super.balance = balance;
    }
    int getBalance(){
        return balance;
    }
}

class BankC extends Bank{
    BankC(int balance){
        super.balance = balance;
    }
    int getBalance(){
        return balance;
    }
}