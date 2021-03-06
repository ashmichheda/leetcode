public class Problem387 {

    public int firstUniqChar(String s) {

        char temp[] = s.toCharArray();
        int n = s.length();
        if(s == null || s.length() == 0)
            return -1;
        int record[] = new int[26];
        for(int i = 0; i<n; i++)
            record[temp[i]-'a']++;

        for(int i = 0; i<n; i++){
            if(record[temp[i] - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
