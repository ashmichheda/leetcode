class Problem217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        int length = nums.length;
        boolean containsDuplicate = false;
        if(length <= 1)
            return containsDuplicate;

        for(int element : nums)
            uniqueNumbers.add(element);

        return (length != uniqueNumbers.size());
    }
}
