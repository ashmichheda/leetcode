public class Problem905 {

    public int[] sortArrayByParity(int[] A) {

        int j = 0, k = A.length-1;
        int result[] = new int[A.length];
        for(int i = 0; i<A.length; i++){
            if(A[i] % 2 == 0) // number is even
                result[j++] = A[i];
            else
                result[k--] = A[i];
        }
        return result;
    }
}
