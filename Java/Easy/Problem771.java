package com.leetcodeEasy.progs;

import java.util.HashMap;
import java.util.Map;

public class Problem771 {


    public int numJewelsInStones(String J, String S) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int count = 0;

        for(char c : J.toCharArray()){
            hashMap.put(c, 1);
        }

        for(char ch : S.toCharArray()){
            if(hashMap.containsKey(ch))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Problem771 p = new Problem771();
        String j = "z";
        String s = "ZZ";
        int result = p.numJewelsInStones(j, s);
        System.out.println("Answer is: "+result);
    }
}
