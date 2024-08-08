/*
1.(L2).Allocate rank for the university students according to their scores by using Maps, Packages.
 */

import java.util.*;

public class D4T3Q1 {
    @SuppressWarnings("removal")
    public static void main(String[] args) {

        // Map Interface referenced to Hashmap class.
        Map <String, Integer> map = new HashMap<>();

        for (int i = 0; i < 11; i++) {
            // Automatically creating strings using Wrapperclass Charector toString method.
            String student = new Character((char)(65+i)).toString();
            // Inserting 
            map.put(student, i);
        }

        for (String key : map.keySet()) {
            System.out.println("Student : "+key+" ; Rank : "+map.get(key));
        }
    }
}
