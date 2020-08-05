class Problem342 {
    boolean result;
    public boolean isPowerOfFour(int num) {
        if(num == 0)
            return false;
        int pow = (int) (Math.log(num)/Math.log(4));
        if(num == Math.pow(4, pow))
            return true;
        else
            return false;
    }
}
