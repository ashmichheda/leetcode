class Problem1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        boolean visited[] = new boolean[n];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                List<Integer> values = new ArrayList<>();
                int size = groupSizes[i];
                int j = i;
                while(j<n && size>0){
                    if(!visited[j] && groupSizes[i] == groupSizes[j]){
                        values.add(j);
                        visited[j] = true;
                        size--;
                    }
                    j++;
                }
                list.add(values);
            }
        }
        return list;
    }
}
