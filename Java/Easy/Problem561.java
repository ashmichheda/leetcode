package com.leetcodeEasy.progs;

import java.util.Arrays;

public class Problem561 {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int ans = 0, length = nums.length;
        for(int i = 0; i<=length-2; i+=2)
            ans += nums[i];
        return ans;
    }

    public static void main(String[] args) {
        Problem561 p = new Problem561();
        int a[] = {1,4,3,2};
        int result = p.arrayPairSum(a);
        System.out.println("Answer is: "+result);
    }
}
