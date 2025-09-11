
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder binaryBuilder = new StringBuilder();


        int a_length = a.length()-1;
        int b_length = b.length()-1;

        int carry =0;
        int sum =0;


        while(a_length>=0 || b_length>=0 || carry>0 ){
            sum = carry;

            if(a_length>= 0 ){
                sum+= a.charAt(a_length--)-'0';
            }
            if(b_length>= 0){
                sum+= b.charAt(b_length--)-'0';     
            }

            binaryBuilder.append(sum%2);

            carry = sum/2;
        }

        binaryBuilder.reverse();
        
        return binaryBuilder.toString();
    
    
    
    }
}

