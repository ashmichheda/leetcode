class Problem1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        // sort intervals based on start index
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int currentInt[] = {-1, -1};
        int overlap = 0;

        for(int [] interval : intervals){
            // if interval is covered by currentInt
            if(currentInt[0] <= interval[0] && currentInt[1] >= interval[1])
                overlap++;

            // if currentInt is covered by interval
            else{
                if(interval[0] <= currentInt[0] && interval[1] >= currentInt[1])
                    overlap++;
                currentInt = interval;
            }
        }
        return intervals.length - overlap;
    }
}
