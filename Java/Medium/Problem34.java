class Problem34 {
    public int[] searchRange(int[] nums, int target) {
       return new int[]{binarySearch(nums, nums.length - 1, target, true),
                        binarySearch(nums, nums.length - 1, target, false)};

    }

    public int binarySearch(int[] nums, int high, int target, boolean first){
        int result = -1;
        int low = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                result = mid;
                if(first){
					high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }
}
