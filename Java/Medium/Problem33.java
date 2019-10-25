class Problem33 {
    public int search(int[] nums, int target) {
        
        int length = nums.length;
        if(length == 0)
            return -1;
        
        int startIndex = 0; int endIndex = length-1;
        while(startIndex <= endIndex){
            int middleIndex = (startIndex + endIndex)/2;
            if(nums[middleIndex] == target)
                return middleIndex;
            
            boolean leftSorted, rightSorted;
            // We need to consider case of pivot
            leftSorted = nums[startIndex] <= nums[middleIndex];
            rightSorted = nums[middleIndex] <= nums[endIndex];
            
            // We go to left ON 2 conditions:
            // 1. leftSorted and target is between there
            // 2. rightSorted and the target is not between there
            if ((leftSorted && nums[startIndex] <= target && nums[middleIndex] > target) || (rightSorted && !   (nums[middleIndex] < target && nums[endIndex] >= target)))
                endIndex = middleIndex-1;
            else
                startIndex = middleIndex+1;
        }
        return -1;
    }
}