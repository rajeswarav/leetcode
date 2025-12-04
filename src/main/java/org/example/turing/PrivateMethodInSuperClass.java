package org.example.turing;
public class PrivateMethodInSuperClass {

    public static void main(String[] args) {
        Subclass s1 = new Subclass();
        s1.foo(); // line 7

        Super s = new Subclass();
    //    s.foo(); // line 10
    }
}

class Super {
     private void foo() {
        System.out.println("Super");
    }
}

class Subclass extends Super {
    static void foo() {
        System.out.println("Subclass");
    }
}
