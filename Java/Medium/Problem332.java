class Problem332 {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> flightsMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        if(tickets == null || tickets.size() == 0)
            return result;

        // connecting every ticket to each other
        //From case 1 --- e.g. MUC - LHR, JFK - MUC, SFO - SJC, LHR, SFO

        for(List<String> list : tickets){
            flightsMap.putIfAbsent(list.get(0), new PriorityQueue<String>());
            flightsMap.get(list.get(0)).offer(list.get(1));
        }

        traverse(flightsMap, "JFK", result);
        return result;
    }

    public void traverse(Map<String, PriorityQueue<String>> flightsMap, String airport, List<String> result){

        PriorityQueue<String> pq = flightsMap.get(airport);
        while(pq != null && !pq.isEmpty()){
            traverse(flightsMap, (String) pq.poll(), result);
        }
        result.add(0, airport);
        // adding 0th index, because of recursion, values are added in reverse order. By                adding 0th index, each value gets pushed down, thus giving correct order
    }
}
