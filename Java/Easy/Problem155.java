class Problem155 {

    /** initialize your data structure here. */
    Queue<Integer> queue = new PriorityQueue<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        queue.offer(x);
    }

    public void pop() {
        int min = stack.pop();
        if(min == getMin())
            queue.poll();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
