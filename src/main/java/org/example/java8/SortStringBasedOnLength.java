package org.example.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStringBasedOnLength {

    public static void main(String[] args) {
        List<String> list = List.of("dddd", "eeeee", "a", "bb", "ccc",  "ffffff");
        System.out.println("Original List: " + list);
        var result = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        //list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
       System.out.println("Result:"+result+" type:"+result.getClass());
    }
}
