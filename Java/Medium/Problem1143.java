class Problem1143 {
    public int longestCommonSubsequence(String s1, String s2) {
       if(s1.length() == 0 || s2.length() == 0)
            return 0;

        // extracting the final characters
        String s1WithoutFinalCharacter = s1.substring(0, s1.length()-1);
        String s2WithoutFinalCharacter = s2.substring(0, s2.length()-1);

        char s1FinalCharacter = s1.charAt(s1.length()-1);
        char s2FinalCharacter = s2.charAt(s2.length()-1);

        if(s1FinalCharacter == s2FinalCharacter){
            /*
                The answer to this SUBPROBLEM is 1 + Max answer to the
                subproblem without either of these characters

             */
            return 1 + longestLength(s1WithoutFinalCharacter, s2WithoutFinalCharacter);
        }
        else{
            return Math.max(longestLength(s1, s2WithoutFinalCharacter), longestLength(s2, s1WithoutFinalCharacter));
        }
    }
    private int longestLength(String s1, String s2) {

        // creating a 2D array DP table
        // S2 will be on the rows, S1 on the columns
        int cache[][] = new int[s2.length()+1][s1.length()+1];

        for(int s2Row = 0; s2Row <= s2.length(); s2Row++){
            for(int s1Col = 0; s1Col<= s1.length(); s1Col++){

                if(s2Row == 0 || s1Col == 0){
                    // Base case where strings are empty
                    cache[s2Row][s1Col] = 0;
                }
                else if(s2.charAt(s2Row - 1) == s1.charAt(s1Col-1)){
                    cache[s2Row][s1Col] = cache[s2Row-1][s1Col-1] + 1;

                }
                else{
                    cache[s2Row][s1Col] = Math.max(cache[s2Row-1][s1Col], cache[s2Row][s1Col-1]);
                }
            }
        }
        return cache[s2.length()][s1.length()];
    }
}
