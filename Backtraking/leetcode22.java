import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();

        valid_generator(result, "",0,0,n);

        return result;
        
    }

    private void valid_generator(List<String>result, String current ,int open , int close, int max){
     if(current.length()==max*2) //endpoint of backtracking
     {
        result.add(current);
     }

     if(open<max)
     {
 
        valid_generator(result, current+"(", open+1, close, max); //open++ -> 인수는 독립적이어야 한다. 사용 X
       
     }

     if(open>close){

        valid_generator(result, current+")", open, close+1, max);
     }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        Solution solution = new Solution();

        List<String> TotalList = solution.generateParenthesis(input);

        System.out.println(TotalList);
        
    }


}