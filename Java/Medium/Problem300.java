class Problem300 {
    public int lengthOfLIS(int[] nums) {

        // null check
        if(nums.length == 0)
            return 0;

        // by default the maximum answer is 1
        int maximumSoFar = 1; int length = nums.length;
        int maxLength[] = new int[length];
        // Pre-fill the array values to 1
        Arrays.fill(maxLength, 1);

        for(int i = 1; i<length; i++){

            for(int j = 0; j<i; j++){
                if(nums[i] > nums[j])
                    maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
            }
            maximumSoFar = Math.max(maximumSoFar, maxLength[i]);
        }

        return maximumSoFar;
    }
}
