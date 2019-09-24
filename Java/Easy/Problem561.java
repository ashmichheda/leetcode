public class Problem561 {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int ans = 0, length = nums.length;
        for(int i = 0; i<=length-2; i+=2)
            ans += nums[i];
        return ans;
    }

}
