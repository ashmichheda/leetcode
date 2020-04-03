class Problem1389 {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> addArray = new ArrayList<>();
        int result[] = new int[nums.length], i = 0;
        for(i = 0; i<nums.length; i++){
            int indexValue = index[i];
            addArray.add(indexValue, nums[i]);
        }
        i = 0;
        for(int ele : addArray){
            result[i++] = ele;
        }
        return result;
    }
}
