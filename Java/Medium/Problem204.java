class Problem204 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null)
            return false;

        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target)
                return true;
            // increment column
            if(matrix[row][col] > target)
                col--;
            // increment row
            else
                row++;
        }
        return false;
    }
}
