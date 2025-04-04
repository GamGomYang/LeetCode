
import java.util.Scanner;
import java.util.List;


public class Solution{
	public int maxArea(int[] height){
		int length =height.length;
		int left =0;
		int right = length-1;
		int area=0;
		int width=0;
		int result =0;

		while(left<right){
			int min = Math.min(height[left],height[right]);
			width = right-left;
			area = width*min;

			if(result<area){
				result = area;
			}


			if(height[left]>height[right]){
				right--;
			}else{
				left++;
			}}
		
              return result;

	}}
