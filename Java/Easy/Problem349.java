class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> numValues = new HashMap<>();
        int m = nums1.length, n = nums2.length;
        for(int i = 0; i<m; i++){
            numValues.put(nums1[i], 1);
        }
        
        int index = 0;
        int result[] = new int[Math.min(n, m)];
        for(int i = 0; i<n; i++){
            
            if(numValues.containsKey(nums2[i])){
                if(numValues.get(nums2[i]) == 1){
                    result[index] = nums2[i];
                    index++;
                    numValues.put(nums2[i], numValues.get(nums2[i])-1);
                }
                
            }
        }
        int answer[] = new int[index];
        for(int i = 0; i<index; i++)
            answer[i] = result[i];
        return answer;
    }
}