class Problem697 {
    public int findShortestSubArray(int[] nums) {
        
        	int length = nums.length, maxFrequency = 0, minArrayDegree = length;
			Map<Integer, List<Integer>> mapNumbers = new HashMap<Integer, List<Integer>>();
			for(int i = 0, len = 0; i<length; i++) {
				List<Integer> positions = mapNumbers.getOrDefault(nums[i], new ArrayList<>());
				positions.add(i);
				len = positions.size();
				if(len > maxFrequency)
					maxFrequency = len;
				mapNumbers.put(nums[i], positions);
			}
			
			for(Map.Entry<Integer, List<Integer>> index : mapNumbers.entrySet()) {
				List<Integer> positions = index.getValue();
				int lengthPositions  = positions.size();
				if(lengthPositions == maxFrequency) {
					int len = positions.get(lengthPositions - 1) - positions.get(0) + 1;
					minArrayDegree = Math.min(len, minArrayDegree);
				}
				
			}
			return minArrayDegree;
    }
}