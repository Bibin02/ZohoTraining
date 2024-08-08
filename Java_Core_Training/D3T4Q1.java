/*
1(L3).Create a Automated Teller Machine Backend Logic using Encapsulation technique in Java
*/

import java.util.Scanner;

public class D3T4Q1 {
    public static void main(String[] args) {

        // Automated Teller Machine Backend normal debit, credit and authenticating purposes. 
        
        // Do while loop to continuesly fetch user Input.
        int kill = 0;
        ATM atm = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 -> Login\nEnter 2 -> Create User\nEnter 3 -> @");
            switch (sc.next()) {
                case "1":
                    // Login
                    System.out.println("Account Number :");
                    int ac = sc.nextInt();
                    System.out.println("Pin :");
                    atm = ATM.login(ac, sc.nextInt());
                    
                    while (atm != null){ // Till atm object becomes null ie, logout. 
                        System.out.println("Welcome ! " +atm.getAcc_no());
                        System.out.println("Enter 1 -> Debit\nEnter 2 -> Credit\nEnter 3 -> Check Balance\nEnter 4 -> Logout\n");
                        switch (sc.next()) {
                            case "1":
                                // Debit
                                System.out.println("Enter Amount :");
                                if(atm.debit(sc.nextInt())){
                                    System.out.println("Sucessfully Debited Take Your cash !");
                                }
                                break;

                            case "2":
                                // Credit
                                System.out.println("Enter Amount :");
                                if(atm.credit(sc.nextInt())){
                                    System.out.println("Sucessfully Credited into your Account !");
                                }
                                break;

                            case "3":
                                // Check balance
                                System.out.println("Current Balance"+atm.checkBalance());
                                break;

                            case "4":
                                // Logout
                                atm = null;
                                break;
                        
                            default:
                                break;
                        }
                    }
                    break;
                case "2":
                    // Create User
                    if (ATM.createUser()) {}
                    else{
                        System.out.println("ATM fatal Error");
                    }
                    break;

                case "3":
                    // Kill process
                    kill = 1;
                    break;

                default:
                    // Unintended input
                    System.out.println("Provide valid option"); 
                    break;
            }
            
        } while (kill != 1);
        sc.close();
    }
    
}

class ATM{
    // ATM with capacity 100 customers and 5 lakhs cash.
    private static int total_cash = 500000;
    private static boolean[] user_accounts = new boolean[10];
    private static int[] user_passcodes = new int[10];
    private static int[] account_holder_cash = new int[10];

    private int acc_no;

    private ATM(int acc_no){
        this.acc_no = acc_no;
    }

    static boolean createUser(){
        int x = returnFreeAccount();
        if (x >= 0) {
            user_accounts[x] = true;
            user_passcodes[x] = GeneratePin();
            System.out.println("Account Created \nAccount Number: "+x
            +"\nGenerated Pin: "+user_passcodes[x]);
            return true;
        }
        return false;
    }

    static ATM login(int acc_no, int pin){
        if (user_accounts[acc_no] && pin == user_passcodes[acc_no]) {
            return new ATM(acc_no);
        }
        System.out.println("Wrong Credentials / No record Available");
        return null;
    }
    
    private static int returnFreeAccount(){
        for (int i = 0; i < user_accounts.length; i++) {
            if ( user_accounts[i] == false) {
                return i;
            }
        }
        return -1;
    }

    private static int GeneratePin(){
        return (int)(Math.random()*10000);
    }

    private boolean isMoneyAvailable(int amount){
        if (amount <= total_cash) {
            return true;
        }
        return false;
    }

    private boolean isMoneyInAccount(int amount){
        if (account_holder_cash[this.acc_no] >= amount) {
            return true;
        }
        return false;
    }

    public int getAcc_no() {
        return acc_no;
    }
    
    int checkBalance(){
        return account_holder_cash[this.acc_no];
    }
    

    boolean debit(int amount){
        if (isMoneyAvailable(amount)) {
            if (isMoneyInAccount(amount)) {
                total_cash = total_cash - amount;
                account_holder_cash[this.acc_no] -= amount;
                return true;
            }
            else{
                System.out.println("Insufficient cash in account");
                return false;
            }
            
        }
        System.out.println("ATM Out of Cash");
        return false;
    }

    boolean credit(int amount){
        total_cash += amount;
        account_holder_cash[this.acc_no] += amount;
        System.out.println("Rupees "+amount+" Received.");
        return true;
    }

    
}
