import java.util.Scanner;
import java.io.*;


public class leetcode12{
 public String intToRoman(int x){
	 String string = String.valueOf(x);
	 
//stringbuilder를 이용한 문자열 뒤집기
StringBuilder reverseString = new StringBuilder(string).reverse();

	 int length = reverseString.length();

	 StringBuilder sb = new StringBuilder();
	 int num=0;

//문자열을 숫자로 변환
//Character.getNumericvalue

	 for(int i=0 ; i< length ; i++){
		 num = Character.getNumericValue(reverseString.charAt(i));

		 if(i==0&&num>0&&num<4){
			 for(int j =0; j<num ;j++){
				 sb.append("I");
			 }}
	      else if(i==0&&num==4){
			  sb.append("VI");
		  }
		  else if(i==0&&4<num&&num<9){
			  
			  int mod = num%5;
			  for(int k=0;k<mod;k++){
				  sb.append("I");
			  }
			  sb.append("V");
		  }else if(i ==0 &&num == 9){
			  sb.append("XI");
		  }


		   if(i==1&&num>0&&num<4){
			 for(int j =0; j<num ;j++){
				 sb.append("X");
			 }}
	      else if(i==1&&num==4){
			  sb.append("LX");
		  }
		  else if(i==1&&4<num&&num<9){
			  int mod = num%5;
			  for(int k=0;k<mod;k++){
				  sb.append("X");
			  }
			  sb.append("L");
		  }else if(i==1&&num == 9){
			  sb.append("CX");
		  }


		  if(i==2&&num>0&&num<4){
			 for(int j =0; j<num ;j++){
				 sb.append("C");
			 }}
	      else if(i==2&&num==4){
			  sb.append("DC");
		  }
		  else if(i==2&&4<num&&num<9){
			 
			  int mod = num%5;
			  for(int k=0;k<mod;k++){
				  sb.append("C");
			  }
			  sb.append("D");
		  }else if(i==2&&num == 9){
			  sb.append("MC");
		  }


		  if(i==3&&num>0&&num<4){
		   for(int j =0; j<num ;j++){
				 sb.append("M");
			 }

		 }
	 
	 }

	 return sb.reverse().toString();
 
 }

 public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();


	leetcode12 solution = new leetcode12();

	String result;

	result = solution.intToRoman(input);

   System.out.println(result);
 }
}

