class Problem520 {
    public boolean detectCapitalUse(String word) {
        int countLower = 0, countUpper = 0;
        boolean flag = false;
        for(int i = 0; i<word.length(); i++){
            if(Character.isLowerCase(word.charAt(i))){
                countLower++;
            }
            else if(i == 0 && Character.isUpperCase(word.charAt(i))){
                flag = true;
                countUpper++;
            }
            else if(Character.isUpperCase(word.charAt(i))){
                countUpper++;
            }
        }
        if(countLower == word.length() && countUpper == 0)
            return true;
        else if(countUpper == 1 && flag && countLower == word.length()-1)
            return true;
        else if(countUpper == word.length() && countLower == 0)
            return true;
        return false;
    }
}
