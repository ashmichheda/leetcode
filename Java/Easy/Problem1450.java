class Problem1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i = 0; i<endTime.length; i++){
            if(queryTime <= endTime[i]){
                if(queryTime >= startTime[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
