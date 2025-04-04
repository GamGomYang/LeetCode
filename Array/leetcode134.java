import java.util.Scanner;


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas_length = gas.length;

        int total_gas_use =0;
        for(int i=0 ; i<gas_length; i++){ 
            total_gas_use += gas[i]-cost[i];
            
        }
        if(total_gas_use < 0 ){
            return -1;
        }

        int start =0;
        int total_gas=0;
        for(int i=0; i<gas_length;i++){
         total_gas += gas[i]-cost[i];
         
         if(total_gas<0){
            start = i+1;
            total_gas=0;
         }
            
        }
return start;

    }

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    Solution solution = new Solution();

    System.out.println("size");

    int size =  scanner.nextInt();

    int [] gas_input =  new int [size];

    int [] cost_input = new int[size];

    for(int k =0; k<size ; k++){

    System.out.println(k+" gas_input");

    gas_input[k] =  scanner.nextInt();

    System.out.println(k+" cost_input");

    cost_input[k] =  scanner.nextInt();
    }


    int result= solution.canCompleteCircuit(gas_input, cost_input);

    System.out.println(result);

    }
}