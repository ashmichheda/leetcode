class Problem1299 {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        for(int i = arr.length - 2; i>=0; i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(arr[i], temp);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
