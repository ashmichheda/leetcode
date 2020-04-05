class Problem258 {
    public int addDigits(int num) {
        int sum = 0;
        while(num > 0 || sum > 9) {

            if (num == 0) {
                num = sum;
                sum = 0;
            }
            int value = num % 10;
            sum += value;
            num /= 10;
        }
        return sum;
    }
}
