package String;
import java.util.*;
import java.io.*;

public class leetcode67{

   public String addBinary (String a , String b){

      StringBuilder sb = new StringBuilder();

      int carry =0;
      int i = a.length()-1;
      int j = b.length()-1;

      while(i>=0||j>=0||carry !=0){


         int total = carry;


         if(i>=0){
            total += a.charAt(i)-'0';

            i--;
         }


         if(j>=0){
            total += b.charAt(j)-'0';
            j--;

         }

         sb.append(total%2);
         carry = total/2;

      }

      return sb.reverse().toString();






      
   }
}