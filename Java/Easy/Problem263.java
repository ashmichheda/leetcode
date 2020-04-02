class Problem263 {
    public boolean isUgly(int num) {

        if(num == 0)
            return false;
        num = divide(num, 2);
        num = divide(num, 3);
        num = divide(num, 5);

        return (num == 1) ? true : false;
    }
    private int divide(int a, int b){
        while(a % b == 0){
            a = a/b;
        }
        return a;
    }
}
