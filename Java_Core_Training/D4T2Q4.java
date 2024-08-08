/*
4(L3). Write a Java program to replace each substring of a given string 
that matches the given regular expression with the given replacement.

Sample string : "The quick brown fox jumps over the lazy dog."
In the above string replace all the fox with cat.

Sample Output:
Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog.
*/
public class D4T2Q4 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String regex = "fox", replace = "cat";
        sentence = replaceWord(sentence, regex, replace);
        System.out.println(sentence);
    }

    static String replaceWord(String sentence, String regex, String replace) {
        StringBuilder stb = new StringBuilder(sentence);
        for (int i = 0; i < sentence.length() - regex.length(); i++) {
            if (sentence.substring(i, i+regex.length()).equals(regex)) {
                stb.replace(i, i+regex.length(), replace);
            }
        }
        return stb.toString();
    }

    // KarpRabin Algorithm.
    static boolean foundMatch(String sentence, String regex) {
        
        return false;
    }
}
