import java.util.Scanner;
import java.util.List;


class leetcode66 {
    public int[] plusOne(int[] digits) {

        int length = digits.length;


        for(int i = length-1; i>=0; i--){

            if(digits[i] == 9){
                digits[i]=0;


            }
            else{

                digits[i]++;

                return digits;
            }
        }

        int[] newNumber = new int[length + 1];
        newNumber[0] = 1;
        
        return newNumber;

       



        
    }
}