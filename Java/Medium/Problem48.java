class Problem48 {
    public void rotate(int[][] matrix) {

        // can be done in 2 steps process
        // 1. Transpose the matrix
        // 2. Horizontal swapping of each row in a matrix

        int len = matrix.length;

        // tranpose the matrix
        for(int i = 0; i<len; i++){
            for(int j = i; j<len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }



        // swap the rows horizontally using 2 pointer approach

        // outer loop i iterates through all rows
        // inner loop will go through half way - 2 pointer approach
        for(int i = 0; i<len; i++){
            for(int j = 0; j<(len/2); j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-1- j]; // swaps first and last element, n - 1 - j --> is the second pointer where we do length - 1 to get the valid index and do '- j' to get the position. It will be at the same distance from the beginning to the same distance from the end.
                matrix[i][len-1-j] = temp;
            }
        }
    }
}
