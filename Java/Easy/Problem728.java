package com.leetcodeEasy.progs;

public class Problem728 {

  public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = left; i<= right; i++){
            int num = i;
            boolean isSelf = true;
            while(num > 0){
                int div = num%10;
                if(div == 0 || i%div != 0){
                    isSelf = false;
                    break;
                }
                num = num/10;
            }
            if(isSelf)
                result.add(i);
        }
        return result;
    }
}
