class MinStack {
    Stack<Integer> stk;
    Stack<Integer> min;
    public MinStack() {
    stk=new Stack<>();
    min=new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty()||val<=min.peek()){
            min.push(val);
        }
        else{
            min.push(min.peek());
        }
    }
    
    public void pop() {
        stk.pop();
        min.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
