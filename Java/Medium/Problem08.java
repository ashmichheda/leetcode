package com.prog.LeetCodeProgs;

public class Problem08 {

	public static void main(String[] args) {
		
		String input = "-91283472332";
		int result = myAtoi(input);
		System.out.println(result);
	}

	private static int myAtoi(String str) {
		
			if (str == null) return 0;
        
			for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);            
	            if (c == ' ') {
	              continue;  
	            } else if (c == '+' || c == '-') {
	                i++;
	                return getNumber(i, str, c);
	            } else if (Character.isDigit(c)) {
	                return getNumber(i, str, '+');
	            } else {
	                return 0;
	            }
        }
        
        return 0;
	}
	
	private static int getNumber(int i, String str, char sign) {
        int num = 0;
        
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int d = str.charAt(i) - '0';
            int nextNum = num * 10 + d;            
            
            // check overflow
            // 1. next number is < 0
            // 2. reverse next number to get original number, if not equal, also means overflow.
            if ((nextNum - d) / 10 != num || nextNum < 0) {
                return sign == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            num = nextNum;
            i++;
        }
        
        return sign == '+' ? num : -num;
    }

}
