class Problem575 {
    public int distributeCandies(int[] candies) {
        
        HashSet<Integer> candiesMap = new HashSet<>();
        int maxCandies = candies.length/2;
        
        for(int i = 0; i<candies.length; i++)
            candiesMap.add(candies[i]);
        if(candiesMap.size() <= maxCandies)
            return candiesMap.size();
        else
            return maxCandies;
    }
}