package org.example.leetcode;


public class RemoveDuplicateFromArray {
    public static void main(String[] args) {

       //int[] nums = {1,1,2,2,3,4,4,4};
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        printArray(nums);
        System.out.println();
        int res= removeDuplicates(nums);
        System.out.println(res);
        printArray(nums);

    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1; j< nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

    }

    private static void printArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
