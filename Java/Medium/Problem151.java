class Problem151 {
    public String reverseWords(String s) {

        s = s.trim();
        if(s.equals(""))
            return s;
        String input[] = s.split(" ");
        s = "";
        for(int i = input.length-1; i>= 0; i--){
            if(!input[i].equals("")){
                s += input[i].trim();
                s += " ";
            }

        }

        return s.substring(0, s.length()-1);
    }
}
