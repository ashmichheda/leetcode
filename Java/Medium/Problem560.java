class Problem560 {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        HashMap<Integer, Integer> arraySum = new HashMap<>();
        arraySum.put(0, 1); // which means we have seen element sum 0 , 1 time
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(arraySum.containsKey(sum-k))
                result += arraySum.get(sum-k);
            arraySum.put(sum, arraySum.getOrDefault(sum, 0)+1);

        }

        return result;
    }
}
