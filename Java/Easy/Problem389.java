class Problem389 {
    public char findTheDifference(String s, String t) {
       int count[] = new int[26];
        for(char c : s.toCharArray())
            count[c - 'a']++;
        for(char c : t.toCharArray())
            count[c - 'a']--;

        for(int i = 0; i<26; i++){
            if(count[i] < 0)
                return (char)(i + 'a');
        }
        return 0;
    }
}
