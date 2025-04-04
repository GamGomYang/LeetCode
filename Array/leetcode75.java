/*
solution1. 버블정렬을 이용한 풀이 -> 너무 많은 실행시간 소요

import java.util.Scanner;
import java.util.Arrays;

public class Solution{
    public void sortColors(int[] nums){
    int length = nums.length;
    int [] result = new int[length];
    int temp;
    for(int k = 0; k<length-1; k++){
    for(int i =0 ; i< length-1 ; i++){
        if(nums[i]>nums[i+1]){
            temp = nums[i];
            nums[i] = nums[i +1];
            nums[i+1] = temp;
        }
    }
    }
     System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size");
        int size = scanner.nextInt();
        int[] input = new int[size];
        for(int i=0 ; i<size ; i++){
            System.out.println("input");
            input[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        scanner.close();
        solution.sortColors(input);

    }
}

*/


//solution2. 0,1,2 개수를 이용해 배열 생성
import java.util.Scanner;
import java.util.Arrays;


class Solution{

    public void sortColors(int[] nums){

        int zero = 0;
        int one = 0;
        int two =0;

        int length = nums.length;

        for(int i=0; i<length;i++){

            if(nums[i]== 0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }

        }
        for(int k = 0 ;k<length ; k++){
            if(k<zero){
                nums[k]=0;
            }
            else if(k<zero+one){
                nums[k]=1;

            }
            else{
                nums[k]=2;
            }

        }
        
        System.out.println(Arrays.toString(nums));
    }


}