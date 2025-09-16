import java.util.StringBuilder;
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String decodeString(String s) {
        Deque<Character> a_stack = new ArrayDeque<>();
        Deque<Character> b_stack = new ArrayDeque<>();
        StringBuilder a_decoder = new StringBuilder();
        StringBuilder b_decoder = new StringBuilder();
        s_length = s.length();

        for(int i =0 ; i<s_length ; i++){
            if(s.charAt(i) == ']'){
                // [ 나올때까지 pop();
                while(stack.pop() == '['){
                a_decoder.append(stack.pop());
                String result = a_decoder.toString();
                int num = Integer.ParseInt(a_stack.pop());
                for(int k =0 ; k< num ; k++){
                    b_decoder.append(result);
                } }
            }
        }else{
        stack.push(s.charAt(i));
        }

        String answer;


        return answer;
        
    }
}