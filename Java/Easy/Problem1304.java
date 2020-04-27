class Problem1304 {
    public int[] sumZero(int n) {
        int result[] = new int[n];
        if(n == 1){
            result[0] = 0;
            return result;
        }
        int val = n / 2;

        // when n is even
        if(n % 2 == 0){
            int i = 0;
            while(i < n){
                result[i] = val;
                result[i+1] = -val;
                i += 2;
                val--;
            }
        }
        else{
            result[0] = 0;
            int i = 1;
            while(i < n){
                result[i] = val;
                result[i+1] = -val;
                i += 2;
                val--;
            }
        }
        return result;
    }
}
