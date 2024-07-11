import java.util.Scanner;

public class leetcode125 {

    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            else if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        leetcode125 solution = new leetcode125();
        boolean result = solution.isPalindrome(input);
        System.out.println(result);
    }
}
