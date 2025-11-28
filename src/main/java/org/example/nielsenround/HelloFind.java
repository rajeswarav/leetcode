package org.example.nielsenround;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class HelloFind {

    public static void main(String[] args) {

        List<Integer> listOfInt = Arrays.asList(1,1,2,3,3,4);

        Set<Integer> set = new HashSet();

        listOfInt.stream()

                .filter(n -> !set.add(n))

                .forEach(System.out::println);

    }

}
