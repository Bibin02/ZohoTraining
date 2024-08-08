/*
(L1)Write a program to illustrate how to throw a ClassNotFoundException.
*/
public class D5T1Q9 {
	public static void main(String[] args) {
		try {
            String cls = "SearchingClass";
			if (cls.getClass().toString() != "class java.lang.String"){
				System.out.println("Class name "+cls.getClass().toString()+" Found");
			}
			else
				throw new ClassNotFoundException();
		}
		catch (ClassNotFoundException cnfe) {
            System.out.println("ClassNotFoundException thrown");
        }
	}
}
