package org.example.round2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MergeTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,10);
        treeMap.put(2,20);
        treeMap.put(3,30);

        TreeMap<Integer,Integer> treeMap1 = new TreeMap<>();
        treeMap1.put(2,15);
        treeMap1.put(3,25);
        treeMap1.put(4,40);

        TreeMap<Integer,Integer> mergedMap = mergeMaps(treeMap, treeMap1);
        System.out.println("mergedMap:"+mergedMap);



    }

    private static TreeMap<Integer, Integer> mergeMaps(TreeMap<Integer, Integer> treeMap, TreeMap<Integer, Integer> treeMap1) {
        if(treeMap.isEmpty() && treeMap1.isEmpty()){
            return new TreeMap<>();
        }
        if(treeMap.isEmpty()){
            return treeMap1;
        }
        if(treeMap1.isEmpty()){
            return treeMap;
        }

        TreeMap<Integer,Integer> mergedMap =  new TreeMap<>(treeMap);

       Set<Map.Entry<Integer, Integer>> entrySet = treeMap1.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            Integer oldValue = mergedMap.getOrDefault(key, 0);
            mergedMap.put(key, oldValue + value);
        }




    return mergedMap;





    }
}
