public class Problem136 {

    public int singleNumber(int[] nums) {

      // Do XOR of all elements and return
      // it is cummulative and commutative
      int value = 0;
      for (int ele : nums)
          value ^= ele;

      return value;
    }
}
