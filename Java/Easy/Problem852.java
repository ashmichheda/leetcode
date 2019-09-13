package com.leetcodeEasy.progs;

public class Problem852 {

    public int peakIndexInMountainArray(int[] A) {

        int length = A.length;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < length - 1; i++) {
            if (A[i] <= A[i + 1])
                continue;
            else {
                flag = true;
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {

        Problem852 p = new Problem852();
        int a[] = {0,2,2,3,1,0};
        int result = p.peakIndexInMountainArray(a);
        System.out.println("Answer is: "+result);
    }
}
