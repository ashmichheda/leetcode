class Problem1221 {
    public int balancedStringSplit(String s) {
        // maintaining the counter from left to right
        /*
            IF encountered --> R -> increment by 1
            IF encountered --> L -> decrement by 1
            When count is 0, means it's balanced, increment counter variable

        */
        int length = s.length(), count = 0, balance = 0;
        for(int i = 0; i < length; i++){
            if(s.charAt(i) == 'R')
                balance++;
            else
                balance--;
            if(balance == 0)
                count++;
        }
        return count;
    }
}
