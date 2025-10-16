package org.example.interfaceexamples;

public class C implements A,B{

    public void test(){
        System.out.println("test from C");
        A.super.test();
    }

    public static void main(String[] args) {
        A c=new C();
        c.test();
    }

}
