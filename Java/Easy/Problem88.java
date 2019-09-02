package com.leetcodeEasy.progs;

public class Problem88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = nums1.length;
        int lenNums1 = length - nums2.length;
        int result[] = new int[length];
        int a = 0, b = 0;
        if(nums2.length == 0)
            return;
        else{
            for(int i = 0; i<length; i++){

                if(a != lenNums1 && b != nums2.length){
                    if(nums1[a] <= nums2[b]){
                        result[i] = nums1[a];
                        a++;
                    }
                    else{
                        result[i] = nums2[b];
                        b++;
                    }
                }
                else{
                    if(a == lenNums1 && b!= nums2.length){
                        while(b < nums2.length){
                            result[i++] = nums2[b++];
                        }
                    }
                    else{
                        while(a < lenNums1){
                            result[i++] = nums1[a++];
                        }
                    }
                    break;

                }

            }
        }

        for(int i = 0; i<length; i++){
            nums1[i] = result[i];
        }

    }
    public static void main(String[] args) {

        int nums1[] = {2, 0};
        int nums2[] = {1};
        int m = 1, n = 1;
        Problem88 p = new Problem88();
        p.merge(nums1, m, nums2, n);
        System.out.println("Final merged sorted array");
        for(int i = 0; i<nums1.length; i++){
            System.out.print(" "+nums1[i]+" ");
        }
    }
}
