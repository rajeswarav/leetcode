package org.example.edgev;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToEnd {

    public static void main(String args[]){
        int[] array = {0, 1, 9, 8, 4, 0, 0, 2};
        System.out.println(Arrays.toString(array));
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[index++]=array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        while (index<array.length){
            array[index++]=0;
        }
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                int temp=array[array.length-i-1];
                array[array.length-i-1]=array[i];
                array[i]=temp;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
