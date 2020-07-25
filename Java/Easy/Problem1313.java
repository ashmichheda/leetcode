class Problem1313 {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int j;
        for(j = 0; j<nums.length-1; j += 2){
            populateArray(nums[j], nums[j+1], list);
        }
        int result[] = new int[list.size()];
        for(j = 0; j<list.size(); j++){
            result[j] = list.get(j);
        }
        return result;
    }
    public void populateArray(int freq, int num, ArrayList<Integer> list){
        for(int i = 0; i<freq; i++)
            list.add(num);
    }
}
