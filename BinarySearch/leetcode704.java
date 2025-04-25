import java.util.Scanner;

class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right =nums.length-1;

        while(left<= right){

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        return -1; // 루프 다 돌았는데도 못 찾았을 경우
    }
    

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("size");
        int size = scanner.nextInt();

        int [] input =  new int[size];
        
        for(int i=0 ; i<size ; i++){

        System.out.println((i+1) + " input");
         input[i] = scanner.nextInt();

        }
        
        System.out.println("target");
        int target = scanner.nextInt();

        Solution solution = new Solution();

        int result = solution.search(input, target);

        System.out.println("result = "+ result );


        scanner.close();


    }
}