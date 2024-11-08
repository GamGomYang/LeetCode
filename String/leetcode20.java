import java.util.Scanner;
import java.util.List;
import java.util.Stack;


public class Solution{
    public boolean isValid(String s){
        int length = s.length();
        Stack<Character> stack = new Stack();

        for(int i=0;i<length; i++){

        char current = s.charAt(i);
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
            stack.push(s.charAt(i));
        }


        else if(s.charAt(i)== ')' || s.charAt(i)== ']'||s.charAt(i)=='}' ){
            if(stack.isEmpty()){
                return false;
            }
            char top = stack.pop();

            if(current == ']'&&top!='['
            ||current == '}'&&top!='{'
            ||current == ')'&&top!='('){
                return false;
            }
        }
    }

     return stack.isEmpty();
        
    }


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        Solution solution = new Solution();

        boolean total_result = solution.isValid(s);

        System.out.println(total_result);

    }
}