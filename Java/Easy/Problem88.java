public class Problem88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = nums1.length;
        int lenNums1 = length - nums2.length;
        int result[] = new int[length];
        int a = 0, b = 0;
        if(nums2.length == 0)
            return;
        else{
            for(int i = 0; i<length; i++){

                if(a != lenNums1 && b != nums2.length){
                    if(nums1[a] <= nums2[b]){
                        result[i] = nums1[a];
                        a++;
                    }
                    else{
                        result[i] = nums2[b];
                        b++;
                    }
                }
                else{
                    if(a == lenNums1 && b!= nums2.length){
                        while(b < nums2.length){
                            result[i++] = nums2[b++];
                        }
                    }
                    else{
                        while(a < lenNums1){
                            result[i++] = nums1[a++];
                        }
                    }
                    break;

                }

            }
        }

        for(int i = 0; i<length; i++){
            nums1[i] = result[i];
        }

    }
  }
}
