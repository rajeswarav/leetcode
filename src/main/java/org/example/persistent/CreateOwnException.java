package org.example.persistent;

public class CreateOwnException {

    public static void main(String[] args)  {
        int i=20;
      //  if(i==10){
      //      throw new MyException("MyException is thrown from main");
       // }
        if(i==20){
            throw  new MyRunTimeException("runtime exception");
        }

    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
