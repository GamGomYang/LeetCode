import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/*
  
  리트코드 2217번
 *문제에서 궁금한점
 * 
 * 1.회문을 찾기
 * 회문? -> palindrome(팰린드롬) : 앞에서 읽거나, 뒤에서 읽어도 동일한 문자,숫자
 * ex: 121 ,1111, 12321, 우영우, 기러기
 * 
 * 2. Math.pow() 의 역할
 *    Math.Pow는 java에서 거듭제곱을 계산하는 함수
 * 
 * 3. StirngBuilder : 문자열을 연결 및 수정작업을 빠르게 할수있음
 *    문자열 (immutable) 문자열 생성마다 메모리 사용 -> 낭비
 *    StringBuilder -> 문자열 변경 수월 -> 메모리 낭비 방지
 * 
 */

public class leetcod2217{

   public long[] kthPalindrome(int [] queries, int intLength){

      int half_length = (intLength+1)/2;
      long start = (long)Math.pow(10,half_length-1);
      //half_length 만큼 자리수를 만들기 위해서 10의 거듭제곱을 사용
      //거듭제곱 -> Math.pow

      long end= (long) Math.pow(10,half_length);
      // half_length자리 수의 마지막번째 회문 
      long[] result = new long[queries.length];

      for(int i=0; i<queries.length;i++){

         long num = start + queries[i]-1;

         if(num>=end){

            result[i]=-1;

         }
         else{
            StringBuilder sb = new StringBuilder(Long.toString(num));
            if(intLength%2 ==1){
               sb.append(new StringBuilder(sb.substring(0,sb.length()-1)).reverse());
//sb.substring(0,sb.length()-1)) -> 스트링의 일부부분만 추출하는 방법이다.
            }
            else{

               sb.append(new StringBuilder(sb).reverse());
            }
            result[i] = Long.parseLong(sb.toString());
         }
      }
      return result;
      




   }
}