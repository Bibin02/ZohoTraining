/*
(L2)Write a program to illustrate sub class exception precedence over base class.
*/

public class D5T1Q4 {
    public static void main(String[] args) {
        try {
            // Divide Number by zero and print it.
            System.out.println(1/0);
        } 
        catch (RuntimeException e){
            System.out.println("runtime exception");
        }
        catch (Exception e) {
            System.out.println("exception");
        }
        // The below code is not possible due to compile time error
        // Since we handled the superclass Exception, we can't handle the subclass one due to precedence order
        // subclass > baseclass > superclass (Exception classes)

        // catch (RuntimeException e){}
        
    }
}
