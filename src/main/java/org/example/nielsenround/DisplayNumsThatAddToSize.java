package org.example.nielsenround;

import java.util.HashSet;
import java.util.Set;

public class DisplayNumsThatAddToSize {
    public static void main(String[] args) {
        int[] array = {10,10,4,3, 1, 2};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            int complement = array.length - currentNum;

            if(set.contains(complement)){
                System.out.println(complement + " " + currentNum);
                break;
            }
            set.add(currentNum);
        }


    }

}
