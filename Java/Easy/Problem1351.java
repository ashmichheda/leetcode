class Problem1351 {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int i = 0, j = 0, count = 0;
        while(i < rows && j < cols){
            if(grid[i][j] < 0){
                count += (cols - j);
                i++;
                j = 0;
            }
            else
                j++;
            if(j == cols && i < rows){
                j = 0;
                i++;
            }
        }
        return count;
    }
}
