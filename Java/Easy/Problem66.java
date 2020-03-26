class Problem66 {
    public int[] plusOne(int[] digits) {
      int index = digits.length-1;
        while(index >= 0 && digits[index] == 9){
            digits[index] = 0;
            index--;
        }
        if(index == -1){
            int result []= new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i<result.length; i++){
                result[i] = 0;
            }
            return result;
        }
        digits[index] += 1;
        return digits;
    }
}
