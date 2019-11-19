class Problem166 {
    public String fractionToDecimal(int numerator, int denominator) {
        // if numerator is 0 -- then answer is 0
        if(numerator == 0)
            return "0";

        StringBuilder result = new StringBuilder();
        if((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
            result.append("-");

        // convert numerator and denominator to get rid of int overflow
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        result.append((n/d));
        long rem = n % d;
        if(rem == 0)
            return result.toString();

        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while(!map.containsKey(rem)){
            map.put(rem, result.length());
            rem *= 10;
            result.append(rem/d);
            rem = rem%d;
            if(rem == 0)
                return result.toString();
        }
        int index = map.get(rem);
        result.insert(index, "(");
        result.append(")");

        return result.toString();
    }
}
