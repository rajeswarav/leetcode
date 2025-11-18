package org.example.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Student {

    private final String name;
    private final int rollNumber;
    private final List<Integer> grades;   // mutable
    private final Address address;        // mutable custom object

    public Student(String name, int rollNumber, List<Integer> grades, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;

        // Defensive copy for mutable list
        this.grades = new ArrayList<>(grades);

        // Defensive copy for mutable custom object
        this.address = new Address(address);  // calls copy constructor
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // defensive copy
    }

    public Address getAddress() {
        return new Address(address); // return deep copy
    }
}

