class Problem283 {
    public void moveZeroes(int[] nums) {

        // using 2 pointer approach.
        int k = 0, length = nums.length;

        for(int i = 0; i<length; i++){
            if(nums[i] != 0)
                nums[k++] = nums[i];
        }
        while(k < length){
            nums[k++] = 0;
        }
    }
}
