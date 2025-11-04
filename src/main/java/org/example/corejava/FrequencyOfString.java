package org.example.corejava;

import java.util.HashMap;
import java.util.Map;

//Count character occurrences: Find the frequency of each character
// in a string using a HashMap.
public class FrequencyOfString {
    public static void main(String[] args) {
        String name="rajavegi";

        Map<Character, Integer> map = test(name);
        System.out.println(map);
    }

    private static Map<Character, Integer> test(String name) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
