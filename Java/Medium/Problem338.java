public class Problem338 {
    public int[] countBits(int num) {

        int result[] = new int[num+1];
        // Performing bitwise & operation with n and n-1 till n!= 0
        // assign the value back to n, n = n & (n-1) and increment counter
        // return count
        if(num == 0){
            result[0] = 0;
            return result;
        }
        else{
            int count = 0, j = 0, value;
            for(int i = 0; i<=num; i++){
                value = i;
                while(value > 0){
                    value &= (value - 1);
                    count ++;
                }
                result[j] = count;
                j++;
                count = 0;
            }
            return result;
        }

    }
}
