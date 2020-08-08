class Problem797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Arrays.asList(0));
        int destination = graph.length - 1;

        // start BFS
        while(!queue.isEmpty()){
            List<Integer> path = queue.poll();
            int current = path.get(path.size()-1);
            if(current == destination){
                result.add(path);
            }
            for(int adjNode : graph[current]){
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(adjNode);
                queue.add(newPath);
            }
        }
        return result;

    }
}
