/*
1(L1).Write a Java program to get the character at the given index within the String.
*/
public class D4T2Q1 {
    public static void main(String[] args) {
        String str = "The World is Mine";
        int index = 4;
        char c = getChar(str, index);
        System.out.println("String given : "+str+"Character at index :"+index+" is :"+c);
    }

    private static char getChar(String str, int index) {
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
}
