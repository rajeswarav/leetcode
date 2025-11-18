package org.example.round2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortWordTes {

    public static void main(String[] args) {
        //String name = "raja is awesome";
        String name = "hi my to go raja is awesome";
        System.out.println("name: " + name);
        String result = sortString(name);
        System.out.println(result);
    }

    private static String sortString(String name) {
        StringBuffer   result = new StringBuffer();
       String[] words =  name.split("\\s+");
       TreeMap<Integer, List<String>> map = new TreeMap<>();
        for(String word : words){
            int len = word.length();
            map.computeIfAbsent(len, k -> new ArrayList<>()).add(word);
        }
        System.out.println(map);
        for(Map.Entry<Integer, List<String>> entry : map.entrySet()){
            Integer key = entry.getKey();
            List<String> value = entry.getValue();
            //result.append(value+" ");
            for(int i = 0; i < value.size(); i++){
                result.append(value.get(i)+" ");
            }
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }


}

