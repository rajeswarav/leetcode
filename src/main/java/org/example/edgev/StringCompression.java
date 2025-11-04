package org.example.edgev;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccd";

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max = 0;
        StringBuilder sb = new StringBuilder();
        map.forEach((c,v)->{sb.append(c);sb.append(v);});
        System.out.println(sb.toString());
    }
}
