class Problem741 {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        return Math.max(0, pickUpCherries(grid, n, 0, 0, 0, 0, new int [n][n][n][n]));
    }

    private int pickUpCherries(int [][] grid, int n, int r1, int c1, int r2, int c2, int [][][][] dp){
       if(r1 >= grid.length || r2>= grid.length || c1 >= grid[0].length || c2 >= grid[0].length || grid[r1][c1] == -1 || grid[r2][c2] == -1)
           return Integer.MIN_VALUE;

        if(dp[r1][c1][r2][c2] != 0)
            return dp[r1][c1][r2][c2];

        if(r1 == grid.length-1 && c1 == grid[0].length - 1)
            return grid[r1][c1];

        if(r2 == grid.length-1 && c2 == grid[0].length - 1)
            return grid[r2][c2];

        int cherries = 0;
        // when 2 people reach at the same destination, count only once
        if(r1 == r2 && c1 == c2)
            cherries = grid[r1][c1];
        else
            cherries = grid[r1][c1] + grid[r2][c2];


        // since each person of the 2 person can move only to the bottom or to the right,  ,            then the total number of cherries
    // equals the max of the following possibilities:
    //    P1     |      P2
    //   DOWN    |     DOWN
    //   DOWN    |     RIGHT
    //   RIGHT   |     DOWN
    //   RIGHT   |     RIGHT
        cherries += Math.max(
            Math.max(pickUpCherries(grid, n, r1+1, c1, r2+1, c2, dp), pickUpCherries(grid, n, r1+1, c1, r2, c2+1, dp)),
            Math.max(pickUpCherries(grid, n, r1, c1+1, r2+1, c2, dp), pickUpCherries(grid, n, r1, c1+1, r2, c2+1, dp)));

        dp[r1][c1][r2][c2] = cherries;
        return dp[r1][c1][r2][c2];

    }
}
