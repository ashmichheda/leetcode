public class Problem136 {

    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        boolean foundDuplicate = false;
        int num = 0, length = nums.length;

        if(length == 1)
            return nums[0];
        else{
            for(int i = 0; i<length-1; i++){
                if(nums[i] != nums[i+1]){
                    if(foundDuplicate)
                        foundDuplicate = false;
                    else{
                        num = nums[i];
                        return num;
                    }
                }
                else{
                    foundDuplicate = true;
                }
            }
            if(!foundDuplicate)
                num = nums[length-1];
            return num;
        }
    }
}
