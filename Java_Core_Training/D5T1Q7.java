/*
(L1)Write a program for creation of user defined exception.
*/
public class D5T1Q7 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    
    @Override
    public String getMessage(){
        return "From My Exception";
    }
}