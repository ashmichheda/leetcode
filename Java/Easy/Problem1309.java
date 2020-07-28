class Problem1309 {
    public String freqAlphabets(String s) {
        int i = 1;
        char alpha[] = new char[27];
        for(char c = 'a'; c <= 'z'; c++){
            alpha[i++] = c;
        }
        String result = "";
        for(int j = s.length()-1; j >= 0; j--){
            if(s.charAt(j) == '#'){
                String temp = s.substring(j-2, j);
                int val = Integer.parseInt(temp);
                result = result + alpha[val];
                j = j - 2;
            }
            else{
                char alphabet = s.charAt(j);
                int val = Character.getNumericValue(alphabet);
                result = result + alpha[val];
            }
        }
        return new StringBuilder(result).reverse().toString();
    }
}
