class Problem922 {
    public int[] sortArrayByParityII(int[] nums) {
        
        int length = nums.length;
        int len = length/2;
        int odd[] = new int[len];
        int even[] = new int[len];
        int m = 0, n = 0;
        for(int i = 0; i<length; i++){
            if(nums[i] % 2 == 0)
                even[m++] = nums[i];
            else
                odd[n++] = nums[i];
        }
        m = 0; n = 0;
        for(int i = 0; i<length; i++){
            if(i % 2 == 0)
                nums[i] = even[m++];
            else
                nums[i] = odd[n++];
        }
        return nums;
    }
}