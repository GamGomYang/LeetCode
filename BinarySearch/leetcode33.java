import java.util.Scanner;

class Solution {
    public int search(int[] nums, int target) {

        int left =0 ;
        int right= nums.length-1;


        while(left<=right){
         
            int mid = left + (right - left)/2;

            if(nums[mid]== target){

                return mid;
            }


            if(nums[mid]>=nums[left]){
                if(target < nums[mid]&& target>= nums[left]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }


            }
            else{
                if(nums[mid]< target && target <=nums[right] ){
                    left = mid +1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    Solution solution = new Solution();

    int size = scanner.nextInt();

    int[] array = new int[size];

    for(int i =0 ; i< size ; i++ ){

        System.out.println(i+"array  : " );
        array[i]= scanner.nextInt();


    }

   
    System.out.println(" target? : ");
    int target = scanner.nextInt();
    int result = solution.search(array, target );

     System.out.println(result);

    }

}