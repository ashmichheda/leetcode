class Problem507 {
    public boolean checkPerfectNumber(int num) {
        if(num == 0)
            return false;

        // find divisors of num and keep adding it to sum except num
        int sum = 0;

        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                if(num/i == i)
                    sum += i;
                else
                    sum += i + (num/i);
            }
        }
        if((sum - num) == num)
            return true;
        else
            return false;
    }
}
