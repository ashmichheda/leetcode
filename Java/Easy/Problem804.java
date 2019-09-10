class Problem804 {
    public int uniqueMorseRepresentations(String[] words) {

        String morseCode [] = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        List<String> transformationsList = new ArrayList<String>();
        for(int i = 0; i<words.length; i++){
            String word = words[i];
            String value = "";

            for(int j = 0; j<word.length(); j++){
                value = value + morseCode[word.charAt(j)-'a'];
            }
            if(!transformationsList.contains(value))
                transformationsList.add(value);
        }
        return transformationsList.size();
    }
}
