/*
(L1)Write a program to illustrate usage of try/catch with finally clause.
*/
public class D5T1Q5 {
    public static void main(String[] args) {
        try {
            System.out.println("I'm in Try Block");
        } catch (Exception e) {
            System.out.println("I've catched an Exception");
        }
        finally {
            System.out.println("I'm in Finally block");
        }
    }
}
