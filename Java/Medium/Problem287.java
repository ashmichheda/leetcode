class Problem287 {
    public int findDuplicate(int[] nums) {

        int i = 0, length = nums.length, j = nums.length-1;
        for(i = 0; i<length-1; i++){
            while(i < j){
            if(nums[i] == nums[j])
                return nums[i];
            else{
                j--;
                }
            }
            j = length-1;
        }
        return -1;
    }
}
