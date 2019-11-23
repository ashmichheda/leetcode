class Problem146 {

    // using HashTable that backs up doubly linked list for O(1) access to cache items
    Map<Integer, ListNode> hashtable = new HashMap<Integer, ListNode>();
    ListNode head;
    ListNode tail;


    int totalItemsInCache;
    int maxCapacity;

    public LRUCache(int maxCapacity) {
        // cache starts empty
        totalItemsInCache = 0;
        this.maxCapacity = maxCapacity;

        // Initializing dummy heads and tail nodes to avoid empty states
        head = new ListNode();
        tail = new ListNode();

        // Wire head and tail together
        head.next = tail;
        tail.prev = head;


    }

    public int get(int key) {
        ListNode node = hashtable.get(key);
        if(node == null)
            return -1;

        // Item has been accessed. Move node to the front of the cache
        moveToHead(node);
        return node.value;
    }

    public void moveToHead(ListNode node){
        removeFromList(node);
        addToFront(node);
    }

    public void addToFront(ListNode node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    public void removeFromList(ListNode node){
        ListNode savedPrev = node.prev;
        ListNode savedNext = node.next;

        savedPrev.next = savedNext;
        savedNext.prev = savedPrev;
    }

    public void put(int key, int value) {
        ListNode node = hashtable.get(key);
        if(node == null){
            //Item not found, create new entry
            ListNode newNode = new ListNode();
            newNode.key = key;
            newNode.value = value;

            // add entry into hashtable
            hashtable.put(key, newNode);
            addToFront(newNode);
            totalItemsInCache++;

            // If over capacity remove the LRU Item
            if(totalItemsInCache > maxCapacity){
                removeLRUEntry();
            }
        }
            else{
                node.value = value;
                moveToHead(node);
            }
    }

    public void removeLRUEntry(){
        ListNode tailItem = tail.prev;
        removeFromList(tailItem);

        hashtable.remove(tailItem.key);
        totalItemsInCache--;

    }


    private class ListNode{
        int key;
        int value;

        ListNode prev;
        ListNode next;
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
