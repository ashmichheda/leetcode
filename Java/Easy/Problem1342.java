class Problem1342 {
    public int numberOfSteps (int num) {
        int noOfSteps = 0;

        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
                noOfSteps++;
            }
            else{
                num -= 1;
                noOfSteps++;
            }
        }
        return noOfSteps;
    }
}
