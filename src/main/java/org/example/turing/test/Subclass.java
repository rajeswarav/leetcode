package org.example.turing.test;

class Super {
     void foo() {
        System.out.println("Super");
    }
}

class Subclass extends Super {
      void foo() {
        System.out.println("Subclass");
    }

    public static void main(String[] args) {
        Super s = new Subclass();
        s.foo();

    }
}

