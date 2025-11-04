package org.example.corejava;

import java.util.Arrays;
import java.util.Scanner;

public  class DifferenceArray{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        //print array
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[n-1];
        for(int j=0;j<n-1;j++){
            array2[j] = array[j]-array[j+1];
        }

        System.out.println(Arrays.toString(array2));

    }
}

