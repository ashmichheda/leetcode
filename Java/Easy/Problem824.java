public class Problem824 {

    public String toGoatLatin(String input) {

        String vowel = "aeiou";
        String arr[] = input.split(" ");
        String answer = "";
        List<String> ans = new ArrayList<>();
        List<String> finalValue = new ArrayList<>();
        for(String s : arr){

            char temp =  s.charAt(0);
            // check for vowels
            if(vowel.contains((""+temp).toLowerCase())){
                answer = "";
                // append "ma"
                s = s + "ma";
                answer = answer + s;
                ans.add(answer);
            }
            // check for consonants
            else{
                answer = s.substring(1) + s.charAt(0) + "ma";
                ans.add(answer);
            }
        }
        // Adding a's w.r.t the positions
        String value = "";
        for(int i = 1; i<=ans.size(); i++){
            value = "";
            char[] repeat = new char[i];
            Arrays.fill(repeat, 'a');
            value += new String(repeat);
            String val = ans.get(i-1);
            finalValue.add(val+value);
        }
        answer = "";
        for(String list : finalValue)
            answer = answer + list + " ";
        // to remove the extra space in the end
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}
