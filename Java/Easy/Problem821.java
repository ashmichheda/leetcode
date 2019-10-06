
public class Problem821 {

    public int[] shortestToChar(String s, char c) {

        char input[] = s.toCharArray();
        int length = input.length;
        List<Integer> charList = new ArrayList<>();
        for(int i = 0; i<length; i++){
            if(input[i] == c)
                charList.add(i);
        }
        int result[] = new int[length];
        // calculate minimum distance of char c from s
        for(int i = 0; i<length; i++){
            int min = Math.abs(i - charList.get(0));
            for(int j = 1; j<charList.size(); j++){
                if(Math.abs(i-charList.get(j)) < min)
                    min = Math.abs(i-charList.get(j));
            }
         result[i] = min;
        }
        return result;
    }
}
