class Problem1094 {
    public boolean carPooling(int[][] trips, int capacity) {

        int timestamp[] = new int[1000];
        for(int time[] : trips){
            timestamp[time[1]] += time[0];
            timestamp[time[2]] -= time[0];
        }
        
        for(int cap : timestamp){
            capacity -= cap;
            if(capacity < 0)
                return false;
        }
        return true;

    }
}
