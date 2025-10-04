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
