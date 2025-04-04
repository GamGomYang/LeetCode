import java.util.HashSet;

class leetcode128 {
    public int longestConsecutive(int[] nums) {

        int result_length =0;
        int max_length=0;

        //해시셋 - 중복된 숫자 찾기 및 탐색에 수월
        HashSet<Integer> hashset = new HashSet<>();

        for(int num: nums){
            hashset.add(num);
        }

        for(int num: hashset){
            if(!hashset.contains(num-1)){
                int current_num = num;
                result_length= 1;

                while(hashset.contains(current_num+1)){
                    current_num++;
                    result_length++;

                }

              max_length = Math.max(max_length, result_length);
                
            }
        }
    return max_length;
        
    }
}