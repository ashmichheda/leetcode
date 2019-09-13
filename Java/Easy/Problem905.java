package com.leetcodeEasy.progs;

public class Problem905 {

    public int[] sortArrayByParity(int[] A) {

        int j = 0, k = A.length-1;
        int result[] = new int[A.length];
        for(int i = 0; i<A.length; i++){
            if(A[i] % 2 == 0) // number is even
                result[j++] = A[i];
            else
                result[k--] = A[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {3, 1,2,4};
        Problem905 p = new Problem905();
        int result[] = p.sortArrayByParity(a);
        System.out.println("Answer is: ");
        for(int i = 0; i<result.length; i++)
            System.out.print(" "+result[i]+" ");
    }
}
