package org.example.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LengthLongestSubString {
    public static void main(String[] args) {
        //String s = "abcabcbb";
        //String s = "aaa";
        String s = "";
        //String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int low = 0, high = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (high < s.length()) {
            while (set.contains(s.charAt(high))) {
                set.remove(s.charAt(low));
                low++;
            }
                set.add(s.charAt(high));
                maxLen = Math.max(high - low + 1, maxLen);
                high++;

        }
        return maxLen;
    }

    public static int lengthOfLongestSubstringBruteForce(String s) {
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sb.append(arr[j]);
                boolean b = containsDuplicateChar(sb);
               if(b) {
                   System.out.println(sb.toString());
               max = Math.max(max, sb.length());
               }
            }
            sb.delete(0, sb.length());
        }
    return max;
    }

    public static boolean containsDuplicateChar(StringBuilder sb) {
        Set<Character> set = new HashSet<>();
        char[] arr = sb.toString().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])){
                return false;
            }
        }
        return true;
    }


}
