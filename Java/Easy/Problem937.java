class Problem937 {

    class Logs {
        String id;
        String content;

        // add constructor
        public Logs(String id, String content){
            this.id = id;
            this.content = content;
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        List<Logs> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        String result[] = new String[logs.length];

        for(String log : logs){
            int id = log.indexOf(" ");
            String index = log.substring(0, id);
            String content = log.substring(id + 1);

            if(isLetter(content)){
                Logs item = new Logs(index, content);
                letterLogs.add(item);
            }
            else{
                digitLogs.add(log);
            }

            // sort lexicographically content - when Id's are not same
            Collections.sort(letterLogs, (a, b) -> (a.content.equals(b.content) ? a.id.compareTo(b.id) : a.content.compareTo(b.content)));

            // add the letterLogs and then digitLogs to result array
            int p = 0;
            for(Logs ls : letterLogs){
                result[p++] = ls.id + " " + ls.content;
            }

            for(String s : digitLogs){
                result[p++] = s;
            }
        }
        return result;
    }

    private boolean isLetter(String val){
        for(char c : val.toCharArray()){
            if(Character.isLetter(c))
                return true;
        }
        return false;
    }

}
