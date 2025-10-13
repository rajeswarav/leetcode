package org.example.leetcode;

import java.util.*;

public class GroupAnagramTest {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(strs.length);
        List<List<String>> groupAnagram = groupAnagrams(strs);
        System.out.println(groupAnagram);



    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        String key;
        for(String str : strs){
            char[] canonical = str.toCharArray();
            Arrays.sort(canonical);
            key = new String(canonical);

            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
            // map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
            //map.computeIfAbsent(key, k ->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());


    }
}
