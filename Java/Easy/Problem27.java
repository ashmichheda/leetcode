public class Problem27 {
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
