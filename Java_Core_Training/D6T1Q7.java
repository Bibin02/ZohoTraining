/*
7(L3). Write a Java program to remove leading zeros from a given IP address.
 */

 import java.util.regex.Pattern;
 import java.util.regex.Matcher;
 
 public class D6T1Q7 {
 
     public static String removeLeadingZeros(String ipAddress) {
         Pattern pattern = Pattern.compile("(\\b|(?<=\\.))0+(?!\\.)");
         Matcher matcher = pattern.matcher(ipAddress);
         StringBuffer result = new StringBuffer();
 
         while (matcher.find()) {
             matcher.appendReplacement(result, "");
         }
         matcher.appendTail(result);
 
         return result.toString();
     }
 
     public static void main(String[] args) {
         String ipAddress = "192.168.001.001";
         String result = removeLeadingZeros(ipAddress);
         System.out.println("Original IP Address: " + ipAddress);
         System.out.println("IP Address after removing leading zeros: " + result);
     }
 }
 