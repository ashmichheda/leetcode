class Problem167 {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        int j = numbers.length-1, i = 0;
        while(i < j){
            if(numbers[i] + numbers[j] < target)
                i++;
            else if(numbers[i] + numbers[j] > target)
                j--;
            else
                return new int[] {i+1, j+1};
        }

        return new int[1]; // Specify any index for return, as it's a blank array
    }
}
