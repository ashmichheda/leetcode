public class Problem500 {

    public String[] findWords(String[] words) {

        String keyboardChars[] ={"asdfghjkl", "qwertyuiop", "zxcvbnm"};
        List<String> res = new ArrayList<>();
        int count = 0;
        String wordCompare = "";
        for(int i = 0; i<words.length; i++){
            count = 0;
            wordCompare = "";
            String compare = ""+words[i].charAt(0);
            if(keyboardChars[0].contains(compare.toLowerCase())){
                wordCompare = words[i];
                for(int m = 0; m<wordCompare.length(); m++){
                    if(keyboardChars[0].contains((""+wordCompare.charAt(m)).toLowerCase()))
                        count++;
                    else
                        break;
                }
            }
            else if(keyboardChars[1].contains(compare.toLowerCase())){
                wordCompare = words[i];
                for(int m = 0; m<wordCompare.length(); m++){
                    if(keyboardChars[1].contains((""+wordCompare.charAt(m)).toLowerCase()))
                        count++;
                    else
                        break;
                }
            }
            else if(keyboardChars[2].contains(compare.toLowerCase())){
                wordCompare = words[i];
                for(int m = 0; m<wordCompare.length(); m++){
                    if(keyboardChars[2].contains((""+wordCompare.charAt(m)).toLowerCase()))
                        count++;
                    else
                        break;
                }
            }
            if(count == wordCompare.length())
                res.add(wordCompare);

        }
        String answer[] = res.toArray(new String[res.size()]);

        return answer;
    }
}
