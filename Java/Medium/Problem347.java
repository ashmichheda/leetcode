class Problem347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
       //Create a priority queue (Min heap)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((num1, num2) -> map.get(num1) - map.get(num2));
        for (int num : map.keySet()) {
            pq.add(num);
            if (pq.size() > k)
                pq.poll();
        }
        int[] resultArr = new int[k];
        for (int i = k - 1; i >= 0; --i)
            resultArr[i] = pq.poll();
        return resultArr;
    }
}
