package org.example.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStringBasedOnLength {

    public static void main(String[] args) {
        List<String> list = List.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff");
        var result = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("Result:"+result+" type:"+result.getClass());
    }
}
