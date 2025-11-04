package org.example.edgev;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupCharsTest {

    public static void main(String[] args) {

        String str = "aabbccde";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);
        StringBuilder res=new StringBuilder();
        for (Character ch :set){
            res.append(ch);
        }
        System.out.println(res.toString());
    }
}
