package org.example.sealed;

public final class Square implements Shape {
    @Override
    public double area() {
        System.out.println("square area");
        return 0;
    }
}
