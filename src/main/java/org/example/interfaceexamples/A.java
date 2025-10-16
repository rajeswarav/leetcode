package org.example.interfaceexamples;

public interface A {
    default void test() {
        System.out.println("test from A");
    }
}
