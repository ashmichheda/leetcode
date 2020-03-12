class Problem1295 {
    public int findNumbers(int[] nums) {
        int length = nums.length, evenNoOfDigits = 0;
        for(int i = 0; i<length; i++){
            int numDigits = Integer.toString(nums[i]).length();
            if(numDigits % 2 == 0)
                evenNoOfDigits++;
        }
        return evenNoOfDigits;
    }
}
