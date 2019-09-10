package com.leetcodeEasy.progs;

public class Problem709 {

  public String toLowerCase(String str) {

      // We add 32 to the ASCII value of upper case letter
      // ASCII value of A is 65, we add 32 which becomes '97' --> ascii value of small a

      StringBuilder input = new StringBuilder(str);
      System.out.println(input);
      for(int i = 0; i<input.length(); i++){

          if(input.charAt(i) >= 65 && input.charAt(i) <= 91){
              input.setCharAt(i, (char)(input.charAt(i) + 32));
          }

      }
      return input.toString();
  }
}
