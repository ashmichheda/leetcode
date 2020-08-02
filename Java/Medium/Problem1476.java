class Problem1476 {

    int rect[][];
    public SubrectangleQueries(int[][] rectangle) {
        int row = rectangle.length, col = rectangle[0].length;
        rect = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                rect[i][j] = rectangle[i][j];
            }
        }
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i<= row2; i++){
            for(int j = col1; j<=col2; j++){
                rect[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rect[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
