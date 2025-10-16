package org.example.interfaceexamples;

public interface B {

    default void test() {
        System.out.println("test from B");
    }
}
