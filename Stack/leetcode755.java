import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;


public class leetcode755{

    public int[] dailyTempratures(int[] temperatures){
        int [] result = new int[temperatures.length];
        
        //Stack<Integer> stack = new Stack<>(); 안하는 이유
        // -> 싱글 코어 일때 개발 멀티코어에서 불리 (core lock하기 때문)
        // Deque <Integer> stack = new ArrayDeque<>(); 를 사용하자 
        
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0 ; i< temperatures.length ; i++){


            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int last = stack.pop();
                result[last] = i-last;


            }

            stack.push(i);
        }

        return result;

    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
 
        System.out.print("size");
        int size = scanner.nextInt();

        int[] input = new int[size];


        for(int i=0 ; i< size ; i++){

            System.out.print((i+1)+ " input ");
            input[i] = scanner.nextInt();
        }

        leetcode755 solution = new leetcode755();

        int[] total = new int[size];

        total = solution.dailyTempratures(input);


        
        System.out.println(Arrays.toString(total));
    }
}