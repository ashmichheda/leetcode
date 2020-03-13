class Problem1374 {
    public String generateTheString(int n) {
        int i = 1;
        StringBuilder result = new StringBuilder();

        while(i < n){
            result.append("a");
            i++;
        }
        if(n % 2 == 0)
            result.append("b");
        else
            result.append("a");
        return result.toString();
    }
}
