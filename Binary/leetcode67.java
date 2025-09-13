import java.util.*;

class Solution {
    public String addBinary(String a, String b) {
        int a_length = a.length()-1;
        int b_length = b.length()-1;

        StringBuilder sb = new StringBuilder();
        int carry =0;
        
        while(a_length>=0 || b_length >= 0 || carry >0){
            int sum =0;
            int a_size=0;
            int b_size=0;

            if(a_length >=0){
            a_size = a.charAt(a_length--)-'0';}

            if(b_length >= 0){
            b_size = b.charAt(b_length--)-'0';}

            sum = a_size+b_size+carry;

            if(sum%2 == 1){
                sb.append('1');
            }else{
                sb.append('0');
            }

            carry =sum/2;

        }

        String answer = sb.reverse().toString();

        return answer;
        
    }
}