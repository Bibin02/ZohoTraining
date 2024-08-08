/*
8(L2). Write a Java program to match two strings where one string contains wildcard characters. 
Sample Output:
The given string is: abcdhgh
The given pattern string is: abc*d?*
The given pattern matches.
 */
public class D4T2Q8 {
    public static void main(String[] args) {
        String str = "abcdhgh";
        String regex = "abc*d?*";

        String[] matches = findMatch(str, regex);

        // Display
        display(matches);
    }

    static String[] findMatch(String str, String regex) {
        String[] matches = new String[str.length()];
        
        return matches;
    }

    static void display(String[] matches) {
        for (String string : matches) {
            System.out.print(string+", ");
        }
        System.out.println();
    }
	
}