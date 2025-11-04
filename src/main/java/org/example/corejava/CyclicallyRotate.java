package org.example.corejava;

import java.util.Arrays;

public class CyclicallyRotate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        rotate(arr);

        System.out.println("Rotated array: " + Arrays.toString(arr));

    }


    public static void rotate(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int last = arr[arr.length - 1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;

    }



}
