import java.util.Scanner;
import java.util.List;
import java.util.Arrays;



public class Solution{




    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i =0; i<n;i++){

            for(int j = 1; j<i;j++){

                System.out.print(" ");
            }


            for(int k=i; k<(2*i-1);k++){
                System.out.print("*");
            }


            System.out.println("");


        }
    }
}