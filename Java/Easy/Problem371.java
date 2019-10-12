class Problem371 {
    public int getSum(int a, int b) {

        while(b != 0){

            // Perform carry operation
            int carry = a & b;
            // Perform bitwise OR operation
            a = a ^ b;
            // Perform leftshift operator by 1
            b = carry << 1;
        }
        return a;
    }
}
