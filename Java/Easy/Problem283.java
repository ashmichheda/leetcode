class Problem283 {
    public void moveZeroes(int[] nums) {
        int k = 0, length = nums.length, countNonZeros = 0, flag = 0;

        for(int i = 0; i<length; i++){
            if(nums[i] != 0)
                nums[k++] = nums[i];
        }
        while(k < length){
            nums[k++] = 0;
        }
    }
}
