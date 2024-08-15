import java.util.Scanner;

public class 복습{


    public int lengthOfLastWord(String s){


        String[] words = s.split(" ");

        int maxlength =0;


        for(String word: words){

            if(!word.isEmpty()){

                maxlength = Math.max(maxlength, word.length());






            }


        }

        return maxlength;
    }


    public static void main(String[] args) {
        


        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();


        복습 solution = new 복습();

        int result = solution.lengthOfLastWord(s);


        System.out.println(result);





    }




}