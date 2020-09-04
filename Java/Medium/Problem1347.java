class Problem1347 {
    public int minSteps(String s, String t) {
        // initialize int array and add frequencies of each char of both strings
        int sCharFreq[] = new int[26];
        int tCharFreq[] = new int[26];

        for(char c : s.toCharArray())
            sCharFreq[c - 'a']++;
        for(char c : t.toCharArray())
            tCharFreq[c - 'a']++;

        int count = 0;
        for(int i = 0; i<26; i++){
            if(sCharFreq[i] > tCharFreq[i])
                count += sCharFreq[i] - tCharFreq[i];
        }
        return count;
    }
}
