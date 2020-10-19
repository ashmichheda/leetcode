class Problem74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix[0].length == 0)
            return false;

        int row = matrix.length;
        int col = matrix[0].length;

        // find the index of the row containing the target
        int index = -1;
        for(int i = 0; i<row; i++){
            if(target < matrix[i][col-1] && target > matrix[i][0]){
                index = i;
                break;
            }
            else if(target == matrix[i][col-1] || target == matrix[i][0]){
                return true;
            }
        }
        if(index == -1)
            return false;

        boolean result = findElement(matrix, target, index);
        return result;
    }
    private boolean findElement(int [][] matrix, int target, int index){

        int left = 0, right = matrix[0].length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[index][mid] == target)
                return true;

            else if(matrix[index][mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
