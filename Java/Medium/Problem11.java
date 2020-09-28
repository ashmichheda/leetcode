class Problem11 {
    public int maxArea(int[] height) {

        int firstPointer = 0, lastPointer = height.length - 1;
        int maxArea = 0;

        // using 2 pointer appraoch
        while(firstPointer < lastPointer){
            if(height[firstPointer] < height[lastPointer]){
                maxArea = Math.max(maxArea, height[firstPointer] * (lastPointer - firstPointer));
                firstPointer += 1;
            }
            else{
                maxArea = Math.max(maxArea, height[lastPointer] * (lastPointer - firstPointer));
                lastPointer -= 1;
            }
        }
        return maxArea;
    }
}
