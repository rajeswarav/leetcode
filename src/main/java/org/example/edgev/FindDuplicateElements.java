package org.example.edgev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println(Arrays.toString(array));
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
          for(int ele:array){
              if(!set.add(ele)) {
                  dup.add(ele);
              }
        }

        System.out.println(dup);
    }
}
