package org.example.nielsenround;

import java.util.ArrayList;
import java.util.List;

public class ListAddRemove {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            list.add(i);

            list.remove( (i - 1));

        }

        System.out.println(list.size());

    }

}
