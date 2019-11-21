class Problem986 {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
       // Comparing the 2 intervals, we can say
        /*
        a = 0  2
        b =   1    5

        To find the intersection interval, we
        Compare the 0th pos of a and b, find its max
        compare the 1st pos of a and b, find its min
        if(min >= max)
            add min and max to the array

        if min is the 1st pos of either a or b,
        move to the next element, as min will never intersect anytime further.

        */

        if(a.length == 0 || a == null || b.length == 0 || b == null)
            return new int[][]{};

        int firstMax, secondMin;
        List<int []> result = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            firstMax = Math.max(a[i][0], b[j][0]);
            secondMin = Math.min(a[i][1], b[j][1]);

            if(secondMin >= firstMax)
                result.add(new int[]{firstMax, secondMin});

            if(a[i][1] == secondMin)
                i++;
            if(b[j][1] == secondMin)
                j++;
        }
        return result.toArray(new int[result.size()][2]);


    }
}
