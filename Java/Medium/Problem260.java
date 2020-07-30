class Problem260 {
    public int[] singleNumber(int[] nums) {
        // take the xor of all the numbers
        int xy = 0;
        for(int num : nums){
            xy ^= num;
        }
        // find the last significant bit from that xorED number (find 1)
        xy &= -xy;
        int res[] = new int[2];
        for(int n : nums){
            if((xy & n) == 0)
                res[0] ^= n;
            else
                res[1] ^= n;
        }
        return res;
    }
}
