class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0; i<strs.length; i++){
            String temp = strs[i];
            String sorted = sortString(temp);
            if(map.containsKey(sorted)){
                map.get(sorted).add(temp);
            }else{
                List<String> list = new ArrayList<String>();
                list.add(temp);
                map.put(sorted, list);
                res.add(list);
            }
        }
        return res;
    }
    private String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
