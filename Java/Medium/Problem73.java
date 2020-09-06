class Problem73 {
    public void setZeroes(int[][] matrix) {
       // using in place, 1st row as replacement of row array and 1st column as replacement of column array

        boolean rowHasZero = false;
        boolean colHasZero = false;

        // check if first row has 0
        for(int i = 0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                rowHasZero = true;
                break;
            }
        }

        // check if first column has 0
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                colHasZero = true;
                break;
            }
        }

        // check for the rest of the matrix
        for(int i = 1; i<matrix.length; i++){
            for(int j = 1; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0; // set for row
                    matrix[0][j] = 0; // set for col
                }
            }
        }

        // set 0 for rows
        for(int i = 1; i<matrix.length; i++){
            if(matrix[i][0] == 0)
                nullifyRow(matrix, i);
        }

        // set 0 for cols
        for(int i = 1; i<matrix[0].length; i++){
            if(matrix[0][i] == 0)
                nullifyCol(matrix, i);
        }

        if(rowHasZero)
            nullifyRow(matrix, 0);
        if(colHasZero)
            nullifyCol(matrix, 0);

    }

    private void nullifyRow(int[][] matrix, int row){
        for(int j = 0; j<matrix[0].length; j++)
            matrix[row][j] = 0;
    }

    private void nullifyCol(int[][] matrix, int col){
        for(int j = 0; j<matrix.length; j++)
            matrix[j][col] = 0;
    }

}
