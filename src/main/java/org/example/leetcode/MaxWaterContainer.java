package org.example.leetcode;

public class MaxWaterContainer {
    public static void main(String[] args) {
       // int[] array = {1,8,6,2,5,4,8,3,7};
        //int[] array ={8,7,2,1};
        int[] array ={1,8,6,2,5,4,8,3,7};
       // int res = maxWater(array);
        int res = maxArea(array);
        System.out.println(res);
    }

    private static int maxWater(int[] array) {
         if (array == null || array.length == 0)
            return 0;
        int max = 0;
        int len = array.length;
        int maxLen= len-1;
        int area = 0;
        for (int i = 1; i < maxLen; i++) {
            int min = 0;
            for (int j =0, k= j+i; j < len && k< len ; j++,k++) {
                System.out.println(array[j]+" "+ array[k]);
                min = Math.min(array[j],array[k]);
                System.out.println("min:"+min+" i:"+i);
            }
            area= Math.max(area, i * min);
            System.out.println("area:"+area);




        }
        return area;

    }


    public static int maxArea(int[] array) {


        if (array == null || array.length == 0)
            return 0;
        int len = array.length;
        int area = 0;
        for (int i = 0; i < len; i++) {
            int min;
            for (int j =0, k= j+i+1; j < len && k< len ; j++,k++) {
                System.out.println(array[j]+" "+ array[k]);
                min = Math.min(array[j],array[k]);
                System.out.println("min:"+min+" i:"+i+1);
                area= Math.max(area, (i+1) * min);
                System.out.println("area:"+area);
            }


        }
        return area;

    }
}
