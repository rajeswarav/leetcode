package org.example.nielsenround;

public class Assignment {



    public static void main(String[] args) {

        int k = 0;

        for (int i = 0; i < 100; i++)

            k = k++;

        System.out.println(k);

        System.out.println(k);


        int x = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println("i: "+i);
            x = x++;
        }
        System.out.println(x);

    }

}