package com.leetcodeEasy.progs;

public class Problem35 {

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        while(index < nums.length && target > nums[index])
            index++;
        return index;
    }
    public static void main(String[] args) {

        int arr[] = {1};
        int num = 2;
        int result = searchInsert(arr, num);
        System.out.println("Position is: "+result);
    }

}
