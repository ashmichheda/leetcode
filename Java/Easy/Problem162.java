class Problem162 {
    public int findPeakElement(int[] nums) {

        int index = 0, i;
        int length = nums.length;

        if(length == 1)
            return 0;

        for(i = 0; i<length; i++){
            if(i == 0){
                if(nums[i] > nums[i+1])
                    return i;
                 }
                else if(i == (length-1)){
                    if(nums[i] > nums[i-1])
                        return i;
                }
              else{
                  if(nums[i] > nums[i+1] && nums[i] > nums[i-1])
                      return i;
              }
            }
        return 0;
        }
}
