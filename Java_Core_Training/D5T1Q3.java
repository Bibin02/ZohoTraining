/*
(L1)Write a program to illustrate how to use multiple catch statements.
*/
public class D5T1Q3 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        } 
        // Multiple Catch blocks should follow the level hierarchy.
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e){
            System.out.println("Someother Exception");
        }
    }
}
