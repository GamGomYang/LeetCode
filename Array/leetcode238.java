import java.util.Scanner;
import java.util.Arrays;


    public class leetcode238{
        public int[] productExceptSelf(int[] nums) {

         int length = nums.length;

         int right =1;
         int left =1;

         int result[] = new int[length];


         for(int i =0 ; i<length ; i++){

            result[i] = left;

            left *= nums[i];

         }

         for(int i=length-1; i>=0 ; i--){

            result[i] *= right;

            right *= nums[i];

         }
         return result;

        }


        public static void main(String[] args) {
            

            Scanner scanner = new Scanner(System.in);

            int size = 0;

            System.out.println("size");

            size = scanner.nextInt();

           int input[] = new int [size];


           for(int i=0 ; i< size ; i++){
            System.out.println("input");

            input[i] = scanner.nextInt();
           }

           leetcode128 solution = new leetcode128();

           int[] total = solution.productExceptSelf(input);

          System.out.println(Arrays.toString(total));

        }

    }