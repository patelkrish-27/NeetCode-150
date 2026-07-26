class MinStack {
    Stack<Pair<Integer, Integer>> st;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (value < min) {
            min = value;
        }
        Pair<Integer, Integer> p = new Pair<>(value, min);
        st.push(p);
    }

    public void pop() {
        st.pop();
        if (st.isEmpty()) {
            min = Integer.MAX_VALUE;
        } else {
            min = st.peek().getValue();
        }
    }

    public int top() {
        return st.peek().getKey();
    }

    public int getMin() {
        return st.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
