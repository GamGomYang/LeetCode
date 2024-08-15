// 자바 디버깅 한번 해봐야겠음
// input : today is a nice day 출력이 5가 아닌 3으로 나오는 이유를 살펴보자

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class leetcode58{

    public int lengthOfLastWord(String s) {


        String[] words = s.split(" ");
        //words = ["Hello", "world", "this", "is", "Java"];

        int LastLength =0;

        int length = words.length -1;

        LastLength = words[length].length();

        return LastLength;




        
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String s = scanner.nextLine();

        leetcode58 solution = new leetcode58();

        int result = solution.lengthOfLastWord(s);

        System.out.println(result);


    }

    



}