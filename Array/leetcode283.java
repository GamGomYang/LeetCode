import java.util.Arrays;
import java.util.Scanner;


public class leetcode283{

    public void moveZeroes(int[] nums) {

      int length = nums.length;

      int count =0;

      for(int num:nums){
         if(num!=0){
            nums[count++]=num;
         }
      }
         while (count < nums.length) {
            nums[count++] = 0;
        }
      
      
        System.out.println(Arrays.toString(nums));
      }


    public static void main(String[] args) {
      

      Scanner scanner = new Scanner(System.in);

      leetcode283 solution = new leetcode283();

      System.out.println("size");

      int size = scanner.nextInt();

      int[] input =  new int[size];

      for(int i=0 ; i<size ; i++){

         System.out.println(i + " input");

         input[i] = scanner.nextInt();

      }
      int[] result =  new int[size];
      

      solution.moveZeroes(input);

      

    }
    

}