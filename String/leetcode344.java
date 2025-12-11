import java.util.Scanner;


public class leetcode344{

    public void reverseString(char[] s){
        int start=0;
        int end = s.length -1;

        while(start<end){
            char temp = s[start];
            s[start]= s[end];
            s[end]= temp;


            start++;
            end--;

        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char[] s = scanner.nextLine().toCharArray();

        leetcode344 solution = new leetcode344();


        solution.reverseString(s);

        int counter = s.length;


        System.out.print("[");
        for(int i =0; i< counter; i++){
            System.out.print(s[i]);
        }
        System.out.print("]");



    }
}