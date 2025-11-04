package org.example.edgev;

import java.util.Arrays;

public class SecondHighestNo {

    public static void main(String[] args) {
        int[] array={10, 20, 4, 45, 99};
        int max=Integer.MIN_VALUE, secondMax=Integer.MIN_VALUE;
        Arrays.sort(array);
        max=array[array.length-1];
        secondMax=array[array.length-2];
        /*for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max=array[i];
            }
            if(array[i]>secondMax){
                secondMax=array[i];
            }

        }*/
        System.out.println(max);
        System.out.println(secondMax);
    }
}
