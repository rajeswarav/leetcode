package org.example.newfeatures;

public class RecordTest {
    public static void main(String[] args) {
        Product p = new Product(2,"tv", 20000.0);
        System.out.println(p.name()+" toString:"+p.toString());
        System.out.println(p.price());
        //set id
        //p.id(3);
        System.out.println(p.id());
        double priceAfterDiscount = p.discountedPrice(10);
        System.out.println("discount price: "+priceAfterDiscount);

        Product p2 = new Product(p.id(),"Laptop", p.price());
        System.out.println(p2.name()+" toString:"+p2.toString());

        Product p3 = new Product(p2.id(),"Tablet", -2000.0);
        System.out.println(p3.name()+" toString:"+p3.toString());
    }
}

record Product(int id, String name, double price){
    public double discountedPrice(double percent) {
        return price - (price * percent / 100);
    }

    public Product{
        if(price < 0){
            throw new IllegalArgumentException("price can't be negative");
        }
    }

}

