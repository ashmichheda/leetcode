class Problem1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        int answer[] = nums.clone();
        Arrays.sort(answer);
        for(int i = 0; i<length; i++){
            map.putIfAbsent(answer[i], i);
        }
        for(int i = 0; i<length; i++){
            answer[i] = map.get(nums[i]);
        }
        return answer;
    }
}
