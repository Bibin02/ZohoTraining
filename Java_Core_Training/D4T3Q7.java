/*
7(L1).Prints the size of the ArrayList
*/

import java.util.*;

public class D4T3Q7 {
    public static void main(String[] args) {
        ArrayList <Object> arrlst = new ArrayList<>();

        // Inserted 4 Elements in arrayList.
        arrlst.add(new Object());
        arrlst.add(new Object());
        arrlst.add(new Object());
        arrlst.add(new Object());

        returnSize(arrlst);
    }

    static void returnSize(ArrayList<Object> arrlst) {
        Iterator <Object> itr = arrlst.iterator(); // Returns the Iterator object for this (ArrayList Collection).
        int count = 0;
        // Hasnext method gives the boolean output whether there is next element if yes returs true and the vice versa.
        while (itr.hasNext()) {
            // itrobject.next() method returns the next element.
            count++;
            itr.next();
        }
        System.out.println(count);
    }
}
