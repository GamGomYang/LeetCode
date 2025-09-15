import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> s_stack = new ArrayDeque<>();
        Deque<Character> t_stack = new ArrayDeque<>();

        StringBuilder s_sb = new StringBuilder();
        StringBuilder t_sb = new StringBuilder();

        int s_length = s.length();
        int t_length = t.length();


        for(int i =0; i< s_length ; i++){
            char s_char = s.charAt(i);

            if(s_char != '#'){
                s_stack.push(s_char);
            }else{
                
                if(!s_stack.isEmpty()){
                    s_stack.pop();}
            }
        }

        for(int k =0; k< t_length ; k++){
            char t_char = t.charAt(k);

            if(t_char != '#'){
                t_stack.push(t_char);
               
            }else{
                if(!t_stack.isEmpty()){
                t_stack.pop();}
            }
        }


        while(!s_stack.isEmpty()){
            s_sb.append(s_stack.pop());
        }
        while(!t_stack.isEmpty()){
            t_sb.append(t_stack.pop());
        }

        String s_result = s_sb.toString();
        String t_result = t_sb.toString();

        if(s_result.equals(t_result)){
            return true;
        }else{
            return false;
        }

    }
}