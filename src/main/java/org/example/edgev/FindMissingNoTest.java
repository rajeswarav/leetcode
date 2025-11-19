package org.example.edgev;

public class FindMissingNoTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};

        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max=array[i];
            }
            if(array[i] < min){
                min=array[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);

        int expectedSum = (max*(max+1))/2;
        System.out.println(expectedSum);
        int actualSum = 0;
        for(int value:array){
            actualSum+=value;
        }
        System.out.println(actualSum);
        int missingNum =  expectedSum-actualSum;
        System.out.println("missing:"+missingNum);

    }

}
