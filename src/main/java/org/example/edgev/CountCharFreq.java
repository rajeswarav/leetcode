package org.example.edgev;

import java.util.HashMap;
import java.util.Map;

public class CountCharFreq {

    public static void main(String[] args) {
        String str = "HelloWorld";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(map);
    }
}
