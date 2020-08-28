class Problem918 {
    public int maxSubarraySumCircular(int[] A) {
        // using Kadane's algorithm
        int totalSum = 0, maxEndingAt = 0, minEndingAt = 0;
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;

        for(int ele : A){
            totalSum += ele;
            maxEndingAt = Math.max(maxEndingAt + ele, ele);
            maxSum = Math.max(maxSum, maxEndingAt);
            minEndingAt = Math.min(minEndingAt + ele, ele);
            minSum = Math.min(minSum, minEndingAt);
        }

        if(maxSum > 0){
            return Math.max(maxSum, totalSum - minSum);
        }
        return maxSum;
    }
}
