class Problem1572 {
    public int diagonalSum(int[][] matrix) {

        int i = 0;
        int j = 0;
        int sum = 0;

        // calculate the sum for 1st diagonal
        while(i < matrix.length && j < matrix[0].length)
            sum += matrix[i++][j++];

        i = 0; j = matrix[0].length - 1;
        // calculate the sum for 2nd diagonal
        while(i < matrix.length && j >= 0)
            sum += matrix[i++][j--];

        // remove the middle element added twice when matrix is of odd length
        return matrix.length % 2 == 0 ? sum : sum - matrix[matrix.length/2][matrix.length/2];

    }
}
