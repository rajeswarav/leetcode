package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Java8Practice {

    public static void main(String[] args) {
        flatMapForNestedList();

    }


    public static void flatMapForNestedList(){
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        System.out.println("original list: " + list);

        //traditional way
        List<String> flat = new ArrayList<>();
        for (List<String> sublist : list) {
            for (String s : sublist) {
                flat.add(s);
            }
        }
        System.out.println(flat);

        //using stream api
        List<String> flat1 =list.stream().flatMap(s->s.stream()).collect(Collectors.toList());
        System.out.println("Flatting map: "+flat1);

    }
}



