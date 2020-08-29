class Problem547 {
    public int findCircleNum(int[][] arr) {

        int count = 0;

        for(int i = 0; i<arr.length; i++){

            // check if visited, 1 = not visited
            if(arr[i][i] == 1){
                arr[i][i] = 0;
                count++;
                dfs(arr, i);
            }
        }
        return count;
    }
    private void dfs(int [][] arr, int v){

        for(int i = 0; i<arr.length; i++){
            // check if visited, 1 = not visited
            if(arr[v][i] == 1){
                arr[v][i] = 0;
                dfs(arr, i);
            }
        }
    }
}
