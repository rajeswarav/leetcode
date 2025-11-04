package org.example.edgev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println(Arrays.toString(array));
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> dup = new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            if(!set.add(array[i])) {
                dup.add(array[i]);
            }
        }

        System.out.println(dup);
    }
}
