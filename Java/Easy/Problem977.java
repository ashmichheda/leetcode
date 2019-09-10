
class Problem977 {
  public int[] sortedSquares(int[] A) {

     int len = A.length;
     int left = 0, right = len - 1, index = len-1;
     int result[] = new int[len];
     while(left <= right){
         if(Math.abs(A[left]) > Math.abs(A[right])){
             result[index] = A[left] * A[left];
             left++;
          }
         else{
             result[index] = A[right] * A[right];
             right--;
         }
         index--;
     }
     return result;
 }
}
