public class Problem53 {

    public int maxSubArray(int[] sums){

        int maxSoFar = sums[0], currentMax = sums[0];
        int size = sums.length;
        for(int i = 1; i<size; i++){
            currentMax = Math.max(sums[i], sums[i]+currentMax);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
  }
