import java.util.*;

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void queue_stack(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        queue_stack();
        int result = stack2.pop();
        return result;
    }
    
    public int peek() {
        queue_stack();
        int result = stack2.pop();
        stack2.push(result);
        return result;
        
    }
    
    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */