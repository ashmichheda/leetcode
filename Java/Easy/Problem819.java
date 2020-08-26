class Problem819 {
    public String mostCommonWord(String paragraph, String[] banned) {

        // Declare a hashmap to store frequency of the words
        Map<String, Integer> freqWords = new HashMap<>();
        String mostCommonWord = "";
        paragraph = paragraph.replaceAll("[!?',;.]"," ");
        String input[] = paragraph.split(" ");

        for(String word : input){
            if(!word.isEmpty()){
                word = word.toLowerCase();
                freqWords.put(word, freqWords.getOrDefault(word, 0) + 1);
            }
        }
        for(String ban : banned){
            if(freqWords.containsKey(ban))
                freqWords.remove(ban);
        }
        int maxValueInMap = (Collections.max(freqWords.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Integer> entry : freqWords.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {
                return entry.getKey();
            }
        }
        return "";
    }
}
