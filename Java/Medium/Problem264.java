class Problem264 {
    public int nthUglyNumber(int n) {
        int uglyArray[] = new int[n];
        uglyArray[0] = 1;
        int multipleOf2 = 2;
        int multipleOf3 = 3;
        int multipleOf5 = 5;
        int uglyNo = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for(int i = 1; i < n; i++){
            uglyNo = Math.min(multipleOf2, Math.min(multipleOf3, multipleOf5));
            uglyArray[i] = uglyNo;
            if(uglyNo == multipleOf2){
                i2 += 1;
                multipleOf2 = uglyArray[i2] * 2;
            }
            if(uglyNo == multipleOf3){
                i3 += 1;
                multipleOf3 = uglyArray[i3] * 3;
            }
            if(uglyNo == multipleOf5){
                i5 += 1;
                multipleOf5 = uglyArray[i5] * 5;
            }
        }
        return uglyNo;
    }
}
