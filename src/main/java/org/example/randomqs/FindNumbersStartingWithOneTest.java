package org.example.randomqs;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersStartingWithOneTest {
    //We have a list of integers. Find out all the numbers starting with 1 using stream function
    //a. 11, 18, 20, 24, 85, 66, 13
    public static void main(String[] args) {
        List<Integer> integerList = List.of( 11, 18, 20, 24, 85, 66, 13);
       // integerList.stream().mapToInt(Integer::intValue).forEach(i  -> { int j = i/10;  if(j==1)  System.out.println(i); });
      List<Integer> numlist=  integerList.stream().map(String::valueOf).filter(i -> i.startsWith("1")).map(Integer::valueOf).toList();
        System.out.println(numlist);
    }
}
