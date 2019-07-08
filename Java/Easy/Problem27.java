package com.prog.LeetCodeProgs;

public class Problem27 {

	public static void main(String[] args) {
		
		// Remove duplicates in sorted array
		int arr[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		int length = removeElement(arr, val);
		System.out.println(length);
		// 0 1 3 0 4
	}

	public static int removeElement(int[] nums, int val) {
        
		int numLen = nums.length;
		int result = 0;
		int j = 0;
		for(int i = 0; i<numLen; i++) {
			
			if(nums[i] != val ) {
				nums[j++] = nums[i];
				result++;
			}
		}
		return result;
    }
}
