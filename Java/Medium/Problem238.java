class Problem238 {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        // get all the left product of each elements in array
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // get all right products of each elements in array
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
