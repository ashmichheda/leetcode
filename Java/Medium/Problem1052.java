class Problem1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
      
        int sum = 0;
        for (int i=0; i < customers.length; i++) {
            sum += (grumpy[i]==0 ? customers[i] : 0);
        }

        int max = 0, total = 0;
        // first sum: k minutes not grumpy .. sum of product of both arr values
        // effectively skipping 'NOT grumpy' values to avoid double counting

        for (int j=0; j < k; j++)
            total +=  grumpy[j]*customers[j];
        max = total;

        // sliding window algo - add next value and push out (substract) oldest value in total. total is alway running total k  'product' values. Calcutate 'max' for each running total
        for (int i=k; i < customers.length; i++) {
            total +=  grumpy[i]*customers[i] - grumpy[i-k]*customers[i-k];
            max = Math.max( max, total);
        }

        return sum + max;
    }
}
