public class Problem1051 {

    public int heightChecker(int[] heights) {

        int length = heights.length;
        int input[] = Arrays.copyOf(heights, length);
        Arrays.sort(heights);

        // compare elements of each index to find disorder in shifting
        int count = 0;
        for(int i = 0; i<length; i++){
            if(heights[i] != input[i])
                count++;
        }

        return count;
    }
}
