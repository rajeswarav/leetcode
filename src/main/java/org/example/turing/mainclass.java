package org.example.turing;


import java.util.HashMap;
import java.util.Map;

class box {
    int width;
    int height;
    int length;
}

class mainclass {
    public static void main(String args[]) {
        box obj1 = new box();
        box obj2 = new box();

        obj1.height = 1;
        obj1.length = 2;
        obj1.width = 1;

        obj2 = obj1;

        System.out.println(obj2.height);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("C", 1);
        map.put("B", 2);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEach(System.out::println);


    }
}

