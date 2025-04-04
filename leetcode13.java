import java.util.HashMap;
import java.util.Scanner;
import java.io.*;


public class leetcode13{
	public int romanToInt(String s){
		HashMap<String , Integer> map = new HashMap<>();


		map.put("I",1);
		map.put("IV",4);
		map.put("V",5);
		map.put("IX",9);
		map.put("X",10);
		map.put("XL",40);
		map.put("L",50);
		map.put("XC",90);
		map.put("C",100);
		map.put("CD",400);
		map.put("D",500);
		map.put("CM",900);
		map.put("M",1000);

		int result =0;
		int i=0;
        int length = s.length();
		while(i<length){

			if(i+1<s.length()&& map.containsKey(s.substring(i,i+2))){
              result += map.get(s.substring(i,i+2));
			  i+=2;
			}
			else if(map.containsKey(s.substring(i,i+1))){
				result += map.get(s.substring(i,i+1));
				i++;
			}
			else{
				return 0;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String input= scanner.nextLine();

		leetcode13 solution = new leetcode13();

		int total = solution.romanToInt(input);


		System.out.println(total);
	}
}