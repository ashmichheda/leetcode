public class Problem38<s> {

    public static String countAndSay(int n) {
        String s[] = new String[30];
        int term = 1;
        s[0] = "1";

        if(n <= term)
            return s[n-1];

        for(int i = term; i<n; i++){
            StringBuilder input = new StringBuilder();
            String prevTerm = s[i-1];
            int len = prevTerm.length();

            // count consecutive digits
            for(int j = 0; j<len; ){
                int count = 1;
                while((j+1 < len) && prevTerm.charAt(j) == prevTerm.charAt(j+1)){
                    count++;
                    j++;
                }
                input.append(count);
                input.append(""+prevTerm.charAt(j));
                j++;
            }
            s[i] = input.toString();
        }

        return s[n-1];
    }
}
