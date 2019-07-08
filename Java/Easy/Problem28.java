package com.prog.LeetCodeProgs;

public class Problem28 {

	public static void main(String[] args) {
		
		String haystack = "mississippi";
		String needle = "pi";
		int answer = strStr(haystack, needle);
		System.out.println(answer);
	}

	private static int strStr(String haystack, String needle) {
		
		if(needle == null || (needle.equals("") && haystack.equals("")))
			return 0;
		if(needle.equals(haystack))
			return 0;
		
		int length = haystack.length() - needle.length();
		
		for(int i = 0; i<length+1; i++) {
			
			if(haystack.substring(i, i+needle.length()).equals(needle))
				return i;
			
		}
		return -1;
	}

}
