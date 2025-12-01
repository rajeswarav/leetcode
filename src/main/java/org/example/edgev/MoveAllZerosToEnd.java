package org.example.edgev;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToEnd {

    public static void main(String args[]){
        int[] array = {0, 1,  3, 0, 2};
        System.out.println("Start:"+Arrays.toString(array));

        int insertPosition = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                array[insertPosition] = array[i];
                insertPosition++;
            }
        }

        System.out.println("Intermediate:"+Arrays.toString(array)+" insertPosition:"+insertPosition+" length:"+array.length);

        while (insertPosition < array.length){
            array[insertPosition] = 0;
            insertPosition++;
        }
        System.out.println("end:"+Arrays.toString(array));


    }
}
