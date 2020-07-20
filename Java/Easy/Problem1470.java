class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int m = 0, p = n;
        int result[] = new int[2*n];
        for(int i = 0; i<result.length; i++){
            if(i % 2 == 0){
                result[i] = nums[m++];
            }
            else{
                result[i] = nums[p++];
            }
        }
        return result;
    }
}
