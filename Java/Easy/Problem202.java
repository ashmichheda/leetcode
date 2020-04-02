public class Problem202 {

    public boolean isHappy(int n) {

        while(true){
            if(n == 1 || n == 7)
                return true;
            if(n < 10)
                return false;
            n = sumSquareDigits(n);
        }
    }

    private int sumSquareDigits(int n) {
        int sum = 0;
        while(n != 0){
            int value = n % 10;
            sum += value*value;
            n /= 10;
        }
        return sum;
    }
}
