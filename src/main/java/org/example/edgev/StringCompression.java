package org.example.edgev;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccd";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(map);
        StringBuilder  sb = new StringBuilder("");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        str = sb.toString();
        System.out.println("str:"+str);
    }





}
