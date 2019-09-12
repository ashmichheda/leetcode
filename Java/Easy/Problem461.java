class Problem461 {
  public int hammingDistance(int x, int y) {

      // XOR the 2 nos.
      // Result contains decimal number having positions at which it's bit are different
      // from x and y
      int result = x ^ y;
      int count = 0; // count the no. of 1s
      while(result > 0){
          int val = result%2;
          result /= 2;
          if(val != 0)
              count++;
      }

      return count;
  }
}
