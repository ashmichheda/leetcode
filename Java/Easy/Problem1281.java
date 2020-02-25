class Problem1281 {
    public int subtractProductAndSum(int n) {
        int ans = 0, sum = 0, product = 1, temp = 0;
        while(n != 0){
            temp = n%10;
            sum += temp;
            product *= temp;
            n /= 10;
        }
        ans = product - sum;
        return ans;
    }
}
