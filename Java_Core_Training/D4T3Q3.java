/*
3(L1).Program to perform various operations on ArrayList.
*/
import java.util.*;
public class D4T3Q3 {
    public static void main(String[] args) {

        ArrayList <Integer> arlst = new ArrayList<>(10); //Declare the initial capacity of arraylist.
        
        arlst.clear(); // Clears the Arraylist

        arlst.add(10); // Adds Contents in Arraylist
        arlst.add(100);
        arlst.add(1000);
        arlst.add(10000);

        System.out.println("Size of Arraylist : "+arlst.size()); // Size is different and indicates the count of contents.

        arlst.remove(0); // Removes element at 0th index or removes the 0 if the element present in ArrayList. 

        Iterator <Integer> itr = arlst.iterator(); // Returns the Iterator object for this (ArrayList Collection).

        // Hasnext method gives the boolean output whether there is next element if yes returs true and the vice versa.
        while (itr.hasNext()) {
            // itrobject.next() method returns the next element.
            System.out.println(itr.next());
        }

        arlst.reversed(); // Reverse the ArrayList and returns the reversed List.

    }
}
