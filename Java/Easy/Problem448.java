public class Problem448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int j= Math.abs(nums[i]) - 1;
            nums[j]=-1*Math.abs(nums[j]); //make negative
        }

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
	}
