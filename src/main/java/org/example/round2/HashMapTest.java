package org.example.round2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

    public static void main(String[] args) {

        //Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(null,null);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //map.put(4,entry.getValue());
        }
        System.out.println(map);

      //  map.keySet().stream().forEach(System.out::println);
    }
}
