/*
(L1)Write a program to describe the usage of throws clause.
*/
public class D5T1Q6 {
    // Intimates that this method won't handle exception and throws a particular Exception.
    public static void main(String[] args) throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            // Prints Error message
            System.out.println(e.getMessage());
        }
    }
}
