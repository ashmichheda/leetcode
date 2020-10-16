class Problem189 {
    public void rotate(int[] nums, int k) {
        // using the reverse approach
        // to know how many numbers to reverse
        k = k % nums.length;
        // 1. reverse the entire array
        // 2. reverse from 0 to k elements
        // 3. reverse from k to nums.length - 1
        reverse(nums, 0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums, k, nums.length-1);
    }
    private void reverse(int [] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
