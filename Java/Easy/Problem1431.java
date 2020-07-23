class Problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find the greatest number of candies from the list
        int max = -1;
        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            if(candy > max)
                max = candy;
        }
        for(int i = 0; i<candies.length; i++){
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
