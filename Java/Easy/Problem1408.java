class Problem1408 {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<String>();
        HashSet<String> values = new HashSet<String>();
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words.length; j++){
                if(j != i){
                    String a = words[i];
                    String b = words[j];
                    if(a.contains(b)){
                        values.add(b);
                    }
                }
            }
        }
        Iterator<String> it = values.iterator();
        while(it.hasNext()){
            result.add(it.next());
        }
        return result;
    }
}
