class Problem139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>();
        for(String list : wordDict)
            dict.add(list);
        Map<String, Boolean> map = new HashMap<>();
        return helper(s, dict, map);
    }
    private boolean helper(String s, HashSet<String> dict, Map<String, Boolean> map){
        if(s.equals(""))
            return true;
        if(map.containsKey(s))
            return map.get(s);
        for(int i = 1; i<=s.length(); i++){
            if(dict.contains(s.substring(0, i)) && helper(s.substring(i, s.length()), dict, map)){
                map.put(s.substring(i, s.length()), true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
}
