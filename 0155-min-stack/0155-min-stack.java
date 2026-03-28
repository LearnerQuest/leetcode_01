class MinStack {
    private Deque<Integer> st; //stores all elements normally.
    private Deque<Integer> minst; //stores only values that are current minimums.

    public MinStack() {
        st= new ArrayDeque<>();
        minst = new ArrayDeque<>();

    }
    
    public void push(int val) {
        st.push(val);
         if(minst.isEmpty() || val <= minst.peek()){
            minst.push(val);
         }
    }
    
    public void pop() {
        int x = st.pop();
        if(x == minst.peek()){
            minst.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */