package org.example.sealed;

public final class Rectangle implements Shape {
    @Override
    public double area() {
        System.out.println("rectangle area");
        return 0;
    }
}
