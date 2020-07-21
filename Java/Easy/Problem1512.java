class Problem1512 {
    public int numIdenticalPairs(int[] nums) {
        // using hashing to store the frequency of each elements
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(frequency.containsKey(nums[i])){
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
            }
            else {
                frequency.put(nums[i], 1);
            }
        }
        // retrieve the frequency of elements
        for(Map.Entry<Integer, Integer> map : frequency.entrySet()){
            count += map.getValue()* (map.getValue() - 1)/2;
        }
        return count;
    }
}
