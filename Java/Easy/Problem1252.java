class Problem1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int row[] = new int[n], col[] = new int[m], count = 0;
        for(int ele[] : indices){
            row[ele[0]]++;
            col[ele[1]]++;
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if((row[i] + col[j]) % 2 == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
