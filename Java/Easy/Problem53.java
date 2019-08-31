package com.leetcodeEasy.progs;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
    public static void main(String[] args) {

        Problem53 p = new Problem53();
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = p.maxSubArray(a);
        System.out.println("Answer is: "+result);
    }
}
