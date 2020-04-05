class Problem1323 {
    public int maximum69Number (int num) {
        int reverseNumber = 0, flag = 0;
        if(num == 9999)
            return num;

        // reverse the number
        while(num != 0){
            int rem = num % 10;
            reverseNumber = reverseNumber*10 + rem;
            num /= 10;
        }

        // re-reversing the number
        while(reverseNumber != 0){
            int rem = reverseNumber % 10;
            if(rem < 9 && flag == 0){
                rem = 9;
                flag++;
            }
            num = num * 10 + rem;
            reverseNumber /= 10;
        }
        return num;
    }
}
