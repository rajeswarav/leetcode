package org.example.turing;


class Parent {
    { System.out.println("A "); }     // Instance block
    static { System.out.println("B "); } // Static block
}

public  class Child extends Parent {
    { System.out.println("C "); }     // Instance block
    static { System.out.println("D "); } // Static block

    public static void main(String[] args) {
        Child child = new Child();
    }
}

