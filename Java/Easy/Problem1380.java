class Problem1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        int[] min = new int[rows], max = new int[cols];

        for(int i = 0; i<rows; i++)
            min[i] = Integer.MAX_VALUE;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                min[i] = Math.min(matrix[i][j], min[i]);
                max[j] = Math.max(matrix[i][j], max[j]);
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(min[i] == max[j])
                    result.add(min[i]);
            }
        }
        return result;
    }
}
