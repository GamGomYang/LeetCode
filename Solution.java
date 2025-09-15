import java.util.*;

class MinStack {
    Deque<Integer> stack;
    Deque<Integer> min_stack;

    public MinStack() {
        stack = new ArrayDeque<>();
        min_stack = new ArrayDeque();
        
    }
    
    public void push(int val) {
   
        stack.push(val);
        if(min_stack.isEmpty() || val<= min_stack.peek()){
        min_stack.push(val);}

    }
    
    public void pop() {
        int result = stack.pop();
        if(result == min_stack.peek()){
        min_stack.pop();}


    }
    
    public int top() {
        int result = stack.pop();
        stack.push(result);
        return result;
        
    }
    
    public int getMin() {
        return min_stack.peek();

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