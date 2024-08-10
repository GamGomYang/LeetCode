import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Soltuion{
    public boolean inValid(String s){

        int Size = s.length();
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<Size;i++){
            char c = s.charAt(i);
            if(c=='(' ||c=='{'||c=='['){
             stack.push(c);
            }

          else if(c == ')' || c == '}' || c == ']'){
            if(stack.isEmpty()){
                return false;

            }
            char pop = stack.pop();
            if (!isMatchingPair(pop, c)) {
                return false; 
            }
          }

            
        }

        return stack.isEmpty();
    }
}