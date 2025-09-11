import java.util.*;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void stack_out(){
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
        stack_out();
        int answer =stack2.pop();
        return answer;

    }
    

    public int peek() {
        stack_out();
        int answer = stack2.pop();
        stack2.push(answer);
        return answer;

    }
    

    public boolean empty() {
        if(stack1.isEmpty()&&stack2.isEmpty()){

            return true;
        }
        else{
            return false;
        }

    }


}
