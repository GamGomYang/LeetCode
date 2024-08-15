// 자바 디버깅 한번 해봐야겠음
// input : today is a nice day 출력이 5가 아닌 3으로 나오는 이유를 살펴보자

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class 복습{

    public int lengthOfLastWord(String s) {


        String[] words = s.split(" ");
        //words = ["Hello", "world", "this", "is", "Java"];

        int max =0;

        //word 는 words의 각 요소를 순차적으로 참조함.
        for(String word : words){

            if(!word.isEmpty()){

                max = Math.max(max, word.length());


            }
        }

        return max;




        
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String s = scanner.nextLine();

        복습 solution = new 복습();

        int result = solution.lengthOfLastWord(s);

        System.out.println(result);


    }

    



}