class Problem1464 {
    public int maxProduct(int[] nums) {
        int firstMax = -1, secondMax = -1;
        for(int ele : nums){
            if(ele >= firstMax){
                secondMax = firstMax;
                firstMax = ele;
            }
            else if(ele > secondMax){
                secondMax = ele;
            }
        }
        return (firstMax - 1)*(secondMax - 1);
    }
}
