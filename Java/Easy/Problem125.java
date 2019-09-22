package com.leetcodeEasy.progs;
import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

public class Problem125 {
    public boolean isPalindrome(String s) {

        int i = 0, j = s.length()-1;
        while(i < j){
            if (!isLetterOrDigit(s.charAt(i)))
                i++;
            else if (!isLetterOrDigit(s.charAt(j)))
                j--;
            else if (toLowerCase(s.charAt(i++)) != toLowerCase(s.charAt(j--)))
                return false;
        }

        return true;
    }
}
