
import java.util.*;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode cur = head;
        int length = 1;
        while (cur.next != null) {
            cur = cur.next;
            length++;
        }
        cur.next = head;
        k = k % length;
        int stepsToNewHead = length - k;
        
        ListNode newTail = cur;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
/*

import java.util.*;

class Solution {
    public String decodeString(String s) {
        Deque<String> stack = new ArrayDeque();
        StringBuilder sb = new StringBuilder();

        int length = s.length();
        int recurse =0;
        String st;

        for(int i =0 ; i<length ; i++){

            if( s.charAt(i)>='a' && s.charAt(i)<='z' ){
                sb.append(s.charAt(i));
            }else if( s.charAt(i)==']'){
                stack.push(sb.toString());
            }
        }

        String result;

        while(!stack.isEmpty()){
            sb.append(stack.pop());

            result = sb.toString();

        }

        
    }
}*/