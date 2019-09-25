public class Problem442 {
    public List<Integer> findDuplicates(int[] nums) {

        Arrays.sort(nums);
        int length = nums.length;
        List<Integer> result = new ArrayList<>();

        if(length == 1)
            return result;
        if(length == 2){
            if(nums[0] == nums[1]){
                result.add(nums[0]);
                return result;
            }
        }

        if(nums == null || length == 0)
            return result;

        for(int i = 0; i<length-2; i++){
            if(nums[i] == nums[i+1] && nums[i] != nums[i+2])
                result.add(nums[i]);
        }
        if(nums[length-2] == nums[length-1])
            result.add(nums[length-2]);
        return result;
    }
}
