package org.example.newfeatures;


public class PatternMatchingRecordsSwitch {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape rectagle = new Rectagle(2, 4);
        double area = calculateArea(circle);
        System.out.println("Area of "+circle.getClass() +" is: " + area);

        area = calculateArea(rectagle);
        System.out.println("Area of "+rectagle.getClass() +" is: " + area);
    }

    public static double calculateArea(Shape shape) {
        return  switch (shape){
            case Circle(int radius) -> Math.PI * radius * radius;
            case Rectagle(int width, int length) -> width * length;
        };

    }
}



sealed  interface Shape permits Circle, Rectagle{
}

record Circle(int radius) implements Shape {}
record Rectagle(int width, int length) implements Shape {}



