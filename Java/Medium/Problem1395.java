class Problem1395 {
    public int numTeams(int[] rating) {
        int numTeams = 0, lessBefore, lessAfter, largeBefore, largeAfter;
        for(int i = 1; i<rating.length - 1; i++){
            lessBefore = lessAfter = largeBefore = largeAfter = 0;
            for(int j = 0; j<rating.length; j++){
                if(i == j)
                    continue;
                if(rating[i] < rating[j]){
                    if(i < j)
                        lessBefore++;
                    else
                        lessAfter++;
                }
                else{
                    if(i < j)
                        largeBefore++;
                    else
                        largeAfter++;
                }
            }
            numTeams += lessBefore * largeAfter + largeBefore * lessAfter;
        }
        return numTeams;
    }
}
