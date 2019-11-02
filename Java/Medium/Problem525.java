class Problem525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // Put 0 initially to check when we get zero and index is -1 since we haven't
        // seen anything. Not yet traversed the array
        hashMap.put(0, -1);
        int maxLength = 0, length = nums.length, count = 0;
        for(int i = 0; i<length; i++){
            if(nums[i] == 0)
                count -= 1;
            else
                count += 1;
            if(hashMap.containsKey(count))
                maxLength = Math.max(maxLength, i - hashMap.get(count));
            else
                hashMap.put(count, i);
        }

        return maxLength;
    }
}
