class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()){
            min.push(val);
        }else{
            min.push(min.peek());
        }
        
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}


