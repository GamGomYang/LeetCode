
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class 복습{

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

        복습 solution = new 복습();

        int result = solution.lengthOfLastWord(s);

        System.out.println(result);


    }

    



}
