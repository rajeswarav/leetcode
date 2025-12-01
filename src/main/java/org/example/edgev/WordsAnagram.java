package org.example.edgev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsAnagram {
    public static void main(String[] args) {
        String a ="raja";
        String b ="ajar";

        boolean res = isAnagrams(a,b);
        System.out.println(res);


    }

    private static boolean isAnagrams(String a, String b) {
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < c1.length; i++) {
            set.add(c1[i]);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        return Arrays.equals(c1, c2);

    }
}
