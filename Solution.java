import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.io.*;

public class Solution{
	public int threeSumClosest(int[] nums , int target){
		int length = nums.length;
		int left;
		int right;
		int sum_closet = nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);

		for(int i=0; i<length-2; i++){
			left = i+1;
			right = length-2;
			int sum;

			while(right> left){
			sum = nums[i]+nums[left]+nums[right];

			if(sum_closet>sum){
				sum_closet = sum;
			}
			if(sum < target){
				left++;
			}
			else if(sum>target){
				right--;
			}
			else{
				return sum;
			}
			}
		}
		return sum_closet;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input;
		int length = scanner.nextInt();

		for(int i=0; i<length ; i++){
		  input[i] = scanner.nextInt(); 
		}
		int target = scanner.nextInt();
		Solution solution = new Solution();
		int result =0;
		result = solution.threeSumClosest(input,target);
		System.out.println(result);

	}
}




/* 

import java.util.Scanner;
import java.util.List;
import java.io.*;

public class Solution {

	public String intToRoman(int x) {
		String string = String.valueOf(x);

		StringBuilder sb = new StringBuilder();

		int length = string.length();
		int i = 0;
		int num = 0;
		String result;
		int mod = 0;
		StringBuilder Rev_String = new StringBuilder();

		Rev_String.append(string);
		Rev_String.reverse();
		string = Rev_String.toString();

		{
			while (i < length) {
				num = Character.getNumericValue(string.charAt(i));

				if (i == 3 && 0 < num && num < 4) {
					for (int j = 0; j < num; j++) {
						sb.append("M");
					}
				}
				if (i == 2 && 0 < num && num < 4) {
					for (int j = 0; j < num; j++) {
						sb.append("C");
					}
				} else if (i == 2 && num == 4) {
					{
						sb.append("DC");
					}
				} else if (i == 2 && num == 5) {
					{
						sb.append("D");
					}
				} else if (i == 2 && num > 5 && num < 9) {
					{
						mod = num % 5;
						for (int k = 0; k < mod; k++) {
							sb.append("C");
						}
						sb.append("D");
						

					}
				} else if (i == 2 && num == 9) {
					sb.append("MC");
				}

				if (i == 1 && 0 < num && num < 4) {
					for (int j = 0; j < num; j++) {
						sb.append("X");
					}
				} else if (i == 1 && num == 4) {
					{
						sb.append("LX");
					}
				} else if (i == 1 && num == 5) {
					{
						sb.append("L");
					}
				} else if (i == 1 && num > 5 && num < 9) {
					{
						mod = num % 5;
						for (int k = 0; k < mod; k++) {
							sb.append("X");
						}
						sb.append("L");

					}
				} else if (i == 1 && num == 9) {
					sb.append("CX");
				}

				if (i == 0 && 0 < num && num < 4) {
					for (int j = 0; j < num; j++) {
						sb.append("I");
					}
				} else if (i == 0 && num == 4) {
					{
						sb.append("VI");
					}
				} else if (i == 0 && num == 5) {
					{
						sb.append("V");
					}
				} else if (i == 0 && num > 5 && num < 9) {
					{

						mod = num % 5;
						for (int k = 0; k < mod; k++) {
							sb.append("I");
						}
						sb.append("V");

					}
				} else if (i == 0 && num == 9) {
					sb.append("XI");
				}

				i++;
			}

		}

		result = sb.reverse().toString();

		return result;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		String result;

		Solution solution = new Solution();

		result = solution.intToRoman(input);

		System.out.println(result);
	}
}
import java.util.Scanner;
import java.util.List;
import java.util.Stack;
import java.io.*;

/*
 * regular expression
 * 
 * 1. * -> 0~n 
 * 2. . -> any charecter
 * 
 * ex: a*.* == aabb
 * 
 */
 /*
public class Solution{
    public boolean isMatch(String s, String p){

        int s_len = s.length();
        int p_len = p.length();

        boolean dp[][] = new boolean[s_len+1][p_len+1];
        dp[0][0]=true;

        /*
         * 1. *문자 처리
         * '*'는 항상 2번째에 쓰인다. (a*, b*)
         * '*'의 특징 
         * 1.특정문자가 한번 이상 반복 사용되어진다.
         * 2.특정문자가 아예 사용되어지지 않을 수 있다.
         * 
         * p = "a*"
           p가 "a*"일 때, *는 a를 0번 반복할 수 있다.
           j = 2일 때, p.charAt(1) == '*'이므로 dp[0][2] = dp[0][0]이 된다.
           dp[0][0]은 빈 문자열과 빈 패턴이 매칭되므로 true이다.
           따라서, "a*"는 빈 문자열과도 매칭되기 때문에 dp[0][2] = true이다.
         * 
         */
    /*    for(int j=2 ; j<= p_len ; j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-2];
                        }
        }
        for(int i =1; i<= s_len; i++){
            for(int j =1 ; j<=p_len ; j++){
                char s_char = s.charAt(i-1);
                char p_char = p.charAt(j-1);
                if(s_char == p_char || p_char =='.'){
                    dp[i][j]= dp[i-1][j-1];
                }
                else if(p_char == '*'){
                    dp[i][j] = dp[i][j-2];
                    char p_pre_char = p.charAt(j-2);
                    if(p_pre_char == s_char || p_pre_char == '.'){
                        dp[i][j] |= dp[i-1][j];
                    }
                }
            }
        }

        return dp[s_len][p_len];
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input_s = scanner.nextLine();
        String intput_p = scanner.nextLine();

        Solution solution = new Solution();
        
        boolean result = solution.isMatch(input_s, intput_p);
        System.out.println(result);
    }
}
*/
