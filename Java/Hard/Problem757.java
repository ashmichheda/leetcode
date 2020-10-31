class Problem757 {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
        int startRange = Integer.MIN_VALUE;
        int endRange = Integer.MIN_VALUE;
        int count = 0;
        for(int interval[] : intervals){
            if(startRange >= interval[0])
                continue;
            else if(endRange >= interval[0]){
                startRange = endRange;
                endRange = interval[1];
                count += 1;
            }
            else{
                startRange = interval[1] - 1;
                endRange = interval[1];
                count += 2;
            }
        }

        return count;
    }
}
