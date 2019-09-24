public class Problem35 {

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        while(index < nums.length && target > nums[index])
            index++;
        return index;
    }
  }
