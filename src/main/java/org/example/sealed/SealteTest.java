package org.example.sealed;

public class SealteTest {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
   /*     shape.area();
        shape =  new Square();
        shape.area();
*/
        double area = getArea(shape);
        System.out.println("Area is " + area);
    }

    private static double getArea(Shape shape) {
        return switch (shape){
            case Rectangle _, Square _ -> shape.area();
        };
    }


}
