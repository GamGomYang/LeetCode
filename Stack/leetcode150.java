import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        //자바에서 stack을 선언할때는 deque를 쓰자.
        //Deque stack = new ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();
        int tokenLength = tokens.length;
        int result =0;


        //string-> int형으로 바꾸는법 Integer.parseInt() 이거임
        // 문자열은 !=, == boolean연산이 안됨 -> .equals 써야함.
        // 어차피 문자열 

        for(String present : tokens){
            int present_int = 0;
            if(present.equals("+")){
                int sum = stack.pop() + stack.pop();
                stack.push(sum);
            }
            else if(present.equals("-")){
                int a = stack.pop();
                int b= stack.pop();
                stack.push(b-a);
            }
            else if(present.equals("*")){
                int mul = stack.pop()*stack.pop();
                stack.push(mul);
            }
            else if(present.equals("/")){
                int a = stack.pop();
                int b= stack.pop();
                stack.push(b/a);

            }else{
                present_int = Integer.parseInt(present);
                stack.push(present_int);
            }

        }

        result = stack.pop();

        return result;

        
    }
}