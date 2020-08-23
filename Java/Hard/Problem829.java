class Problem829 {
    public int consecutiveNumbersSum(int N) {
        int ans = 1; // since the number N will be counted in the sequence
        for(int n = 2; n*(n+1)/2 <= N; n++){
            if((N - (n*(n+1)/2)) % n == 0)
                ans++;
        }
        return ans;
    }
}
