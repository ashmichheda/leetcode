class Problem409 {
    public int longestPalindrome(String s) {

        int characterCount[] = new int[128];
        for(char c : s.toCharArray()){
            characterCount[c]++;
        }
        int result = 0;
        for(int charVal : characterCount){
            result += charVal / 2 * 2;

            if(result%2 == 0 && charVal%2 == 1)
                result += 1;
        }
        return result;
    }
}
