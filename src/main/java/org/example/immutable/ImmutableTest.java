package org.example.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableTest {

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(90);

        Address addr = new Address("Bangalore", "Karnataka");

        Student s = new Student("John", 10, grades, addr);

        // Try modifying original objects
        grades.add(50);
        addr.setCity("Chennai");

        System.out.println(s.getGrades());   // still [90]
        System.out.println(s.getAddress().getCity()); // still Bangalore

        // Try modifying through getters
        s.getGrades().add(100);
        s.getAddress().setCity("Delhi");

        System.out.println(s.getGrades());   // still [90]
        System.out.println(s.getAddress().getCity()); // still Bangalore


    }
}
