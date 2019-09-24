
public class Problem852 {

    public int peakIndexInMountainArray(int[] A) {

        int length = A.length;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < length - 1; i++) {
            if (A[i] <= A[i + 1])
                continue;
            else {
                flag = true;
                index = i;
                break;
            }
        }
        return index;
    }
}
