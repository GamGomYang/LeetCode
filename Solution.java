class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0'; // '0' 또는 '1'을 int로 변환
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);   // 현재 자릿수 값
            carry = sum / 2;      // 올림
        }

        if (carry != 0) sb.append(carry); // 마지막에 올림이 남아있으면 추가

        return sb.reverse().toString(); // 뒤집어서 반환
    }
}

