class Problem1486 {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n]; int xorSum = 0;
        for(int i = 0; i<n; i++){
            nums[i] = start + 2*i;
        }
        for(int i = 0; i<n; i++){
            xorSum ^= nums[i];
        }
        return xorSum;
    }
}
