package com.prog.LeetCodeProgs;

public class Problem26 {

	public static void main(String[] args) {
		
		// Remove duplicates in sorted array
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		int length = removeDuplicates(arr);
		
	}

	public static int removeDuplicates(int[] nums) {
        
		int numLen = nums.length;
		if(numLen == 0 || numLen == 1)
			return numLen;
		
        // Using additional index 'j' for storing elements in the same array
		int j = 0, i;
		for(i = 0; i<numLen - 1; i++) {
			if(nums[i] != nums[i+1]) {
				nums[j++] = nums[i];
			}
		}
        // stores the last element of array
		if(i == numLen - 1) {
			nums[j++] = nums[i];
		}
        
		return j; 
    }
}
