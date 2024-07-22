package String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays; 

public class leetcode937 {
    

    public String[] reorderLogFiles(String[] logs) { 

        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
            /*log.split -> 로그의 각 요소들을 띄어쓰기(" ") 기준으로 나누기
             * 예: jiwon is fun -> ["jiwon","is","fun"]
             * [1].charAt(0) -> 나눈 요소 중 두 번째 요소의 첫 번째 문자 의미
             * ["is"]의 첫 번째 문자 -> i
             */
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }

        letterList.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);

            int compared = s1x[1].compareTo(s2x[1]); 

            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });

        letterList.addAll(digitList);
        return letterList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] logs = new String[n];

        for (int i = 0; i < n; i++) {
            logs[i] = scanner.nextLine();
        }

        leetcode937 solution = new leetcode937(); 

        String[] result = solution.reorderLogFiles(logs);

        System.out.println(Arrays.toString(result));
    }
}
