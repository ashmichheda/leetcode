class Problem668 {
    public int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;

        while(left < right){
            int mid = left + (right - left) / 2;
            int count = 0;
            for(int i = 1; i <= m;i++){
                if(mid / i == 0)
                    break;
                count += Math.min(n, mid / i);
            }
            if(count < k)
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
}
