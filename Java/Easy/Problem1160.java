public class Problem1160 {
  public int countCharacters(String[] words, String chars) {
         int charArray[] = new int[26];
         for(int i = 0; i<chars.length(); i++)
             charArray[chars.charAt(i)-'a']++;

         int counter = 0;

         for(int i = 0; i<words.length; i++){
             int count[] = charArray.clone();

             for(int j = 0; j<words[i].length(); j++){
                 if(count[words[i].charAt(j)-'a'] == 0)
                     break;
                 count[words[i].charAt(j)-'a']--;
                 if(j == words[i].length()-1)
                     counter += words[i].length();
             }
         }
         return counter;
     }
}
