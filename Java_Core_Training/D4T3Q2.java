/*
2(L1).Program to show up the vector class and its methods.

*/
import java.util.*;

public class D4T3Q2 {
    public static void main(String[] args) {
        // List interface referenced to vector class.
        List <Integer> list = new Vector<>();

        // Insert
        for (int i = 0; i < 5; i++){
            list.add(i);
        }


        // Display elements
        for(int ele : list){
            System.out.println(ele);
        }
    }
}
