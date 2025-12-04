package org.example.turing;

public class ExceptionTest {
    public Integer divide(int a, int b) {
        try {
            return a / b;
        } finally {
            System.out.print("finally");
        }
    }

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            System.out.print(exceptionTest.divide(10, 0));
        } catch (Exception ex) {
            System.out.print("Division by 0!");
        }
    }
}
