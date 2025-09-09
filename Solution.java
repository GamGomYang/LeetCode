import java.util.*;


class Solution {
    public int solution(String s) {
        int n = s.length();
        
        int answer = n;

        for(int size = 1; size <=n/2 ; size++){
            StringBuilder compressed = new StringBuilder();

            String prev = s.substring(0 , size);

            int count =1;

            for(int k =size ; k<= n ; k += size){
                String next = (k+size <= n)? s.substring(k, k+size): s.substring(k);

                if(prev.equals(next)){
                    count++;

                }else{
                    if(count >1){
                        compressed.append(count);}
                        compressed.append(prev);
                        prev = next;
                        count =1;
                }
            }
            if(count>1){
                compressed.append(count);
            }
                compressed.append(prev);
            answer = Math.min(answer, compressed.length());


        }
        return answer;
    }
}