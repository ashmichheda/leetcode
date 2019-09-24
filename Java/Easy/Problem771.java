public class Problem771 {
    public int numJewelsInStones(String J, String S) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int count = 0;

        for(char c : J.toCharArray()){
            hashMap.put(c, 1);
        }

        for(char ch : S.toCharArray()){
            if(hashMap.containsKey(ch))
                count++;
        }
        return count;
    }
}
