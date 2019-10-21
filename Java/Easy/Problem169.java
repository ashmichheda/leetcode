package com.leetcodeEasy.progs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem169 {

    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int maxNum = nums.length/2;
        // Store occurrences of element in HashMap
        Arrays.sort(nums);
        Map<Integer, Integer> occurrences = new HashMap<>();
        int i = 0;
        for(int num : nums){
            Integer j = occurrences.get(num);
            occurrences.put(num, (j == null) ? 1 : j+1);
        }
        // retrieve all the values of Map by keys
        for(Map.Entry<Integer, Integer> val : occurrences.entrySet()){
            if(val.getValue() > maxNum){
                majorityElement = val.getKey();
                return majorityElement;
            }
        }
        return majorityElement;
    }

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    // OR Another Approach

    public static void main(String[] args) {
        Problem169 p = new Problem169();
        int nums[] = {2,2,1,1,1,2,2};
        int result = p.majorityElement(nums);
        System.out.println("Answer is: "+result);
    }
}
