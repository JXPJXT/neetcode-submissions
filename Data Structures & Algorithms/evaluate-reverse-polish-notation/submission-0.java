class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for (String s : tokens) {
            if (s.equals("+")) {
                stk.push(stk.pop() + stk.pop());
            } else if (s.equals("-")) {
                int right = stk.pop();
                int left = stk.pop();
                stk.push(left - right);
            } else if (s.equals("*")) {
                stk.push(stk.pop() * stk.pop());
            } else if (s.equals("/")) {
                int right = stk.pop();
                int left = stk.pop();
                stk.push(left / right);
            } else {
                stk.push(Integer.parseInt(s));
            }
        }
        
        return stk.peek();
    }
}