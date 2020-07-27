class Problem739 {
    public int[] dailyTemperatures(int[] result) {
        int count = 0;
        boolean flag = false;
        for(int i = 0; i<=result.length-1; i++){
            int currTemp = result[i];
            count = 0;
            flag = false;
            for(int j = i+1; j<result.length; j++){
                if(result[j] <= currTemp){
                    count++;
                    flag = false;
                }
                else if(result[j] > currTemp){
                    count++;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result[i] = 0;
            }
            else{
                result[i] = count;
            }
        }
        result[result.length-1] = 0;
        return result;
    }
}
