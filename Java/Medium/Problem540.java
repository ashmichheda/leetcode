public class Problem540 {
    public int singleNonDuplicate(int[] nums) {
        int val = 0, length = nums.length;
        boolean check = false;
        if(length == 1)
            return nums[0];


        for(int i = 1; i<length-1; i++){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                check = true;
                val = nums[i];
                return val;
            }
        }

        // check for the 1st element
        if(!check){
            if(nums[0] != nums[1]){
                val = nums[0];
                return val;
            }
            else if(nums[length-1] != nums[length-2]){
                val = nums[length-1];
                return val;
            }
        }
        return val;
    }
}
