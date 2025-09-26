// import java.util.*;

// class Solution {
//     public int calculate(String s) {

//         Deque<Character> stack = new ArrayDeque<>();
//         StringBuilder sb = new StringBuilder();
//         Deque<Character> cal_stack = new ArrayDeque<>();
//         Deque<Integer> stack_1 =  new ArrayDeque<>();

//         int length = s.length();

//         for(int i =0 ; i< length ; i++){
//             if(s.charAt(i)>='0'||s.charAt(i)<='9'){
//                 stack.push(s.charAt(i));
                
//             }else{
//                 while(!stack.isEmpty()){
//                 sb.append(stack.pop());}
//                 String parm_1 = sb.reverse().toString();
//                 int intParm_1 = Integer.parseInt(parm_1);

//                 stack_1.push(intParm_1);
                
//             }
            
//         }
//     }
// }

import java.util.*;

class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb= new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            char currentChar = (char) ('A' + (columnNumber % 26));
            sb.append(currentChar);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
        
        
    }
}


