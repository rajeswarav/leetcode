package org.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterComination17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("2"));
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        Map<Integer, char[]> dialMap = new HashMap<>();
        dialMap.put(2,"abc".toCharArray());
        dialMap.put(3,"def".toCharArray());
        dialMap.put(4,"ghi".toCharArray());
        dialMap.put(5,"jkl".toCharArray());
        dialMap.put(6,"mno".toCharArray());
        dialMap.put(7,"pqrs".toCharArray());
        dialMap.put(8,"tuv".toCharArray());
        dialMap.put(9,"wxyz".toCharArray());
        if(digits.equals("")){
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();
        int arraySize = digits.length();
        if(arraySize==1){
            char[] letters = dialMap.get(digits.charAt(0) -'0');
            for(int i=0;i<letters.length;i++){
                result.add(letters[i]+"");
            }
        }
        if(arraySize == 2){
            char[] let1 = dialMap.get(digits.charAt(0)-'0');
            char[] let2 = dialMap.get(digits.charAt(1)-'0');
            System.out.println("len1:"+let1.length+" len2:"+let2.length);
            for(int i=0;i<let1.length;i++)
                for(int j=0;j<let2.length; j++)
                    result.add(let1[i]+""+let2[j]);
        }
        if(arraySize == 3){
            char[] let1 = dialMap.get(digits.charAt(0)-'0');
            char[] let2 = dialMap.get(digits.charAt(1)-'0');
            char[] let3 = dialMap.get(digits.charAt(2)-'0');
            for(int i=0;i<let1.length;i++)
                for(int j=0;j<let2.length; j++)
                    for(int k=0;k<let3.length; k++)
                    result.add(let1[i]+""+let2[j]+""+let3[k]);
        }
        if(arraySize == 4){
            char[] let1 = dialMap.get(digits.charAt(0)-'0');
            char[] let2 = dialMap.get(digits.charAt(1)-'0');
            char[] let3 = dialMap.get(digits.charAt(2)-'0');
            char[] let4 = dialMap.get(digits.charAt(3)-'0');
            for(int i=0;i<let1.length;i++)
                for(int j=0;j<let2.length; j++)
                    for(int k=0;k<let3.length; k++)
                        for(int l=0;l<let4.length; l++)
                        result.add(let1[i]+""+let2[j]+""+let3[k]+""+let4[l]);
        }
        return result;

    }
}
