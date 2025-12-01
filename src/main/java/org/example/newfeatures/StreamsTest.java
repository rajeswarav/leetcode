package org.example.newfeatures;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c", "d", "e", "f");

        List<String> upperCaseList = list.stream().map(String::toUpperCase).collect(Collectors.toList());//.forEach(System.out::println);
        System.out.println(upperCaseList);

        //sort the list in reverse
        var sortedList =  list.stream().sorted(Comparator.comparing(String::toLowerCase)).toList().reversed();
        System.out.println("sortedList: " + sortedList);

        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("originalList: " + intList);

        var evenList = intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("evenList: " + evenList);

        var evenDoubleList = intList.stream().filter(i -> i % 2 == 0).map(i -> 2*i).collect(Collectors.toList());
        System.out.println("evenDoubleList: " + evenDoubleList);

        int max = intList.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println("max: " + max);
        int min = intList.stream().min(Comparator.comparing(Integer::intValue)).get();
        System.out.println("min: " + min);

        var firstFive = intList.stream().limit(5).collect(Collectors.toList());
        System.out.println("firstFive: " + firstFive);

        int sum = intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: " + sum);

        int secondHighest = intList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("secondHighest: " + secondHighest);

    }
}
