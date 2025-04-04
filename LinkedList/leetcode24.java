import java.util.Scanner;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 /* 
//solution 1: swap to repeat 
public class leetcode24{

    public ListNode swapPairs(ListNode head){

        ListNode node = new ListNode(0);
        ListNode root = node;

        node.next = head;

        while(node.next != null && node.next.next != null){

            ListNode a = node.next;
            ListNode b= node.next.next;

            a.next = b.next;
            node.next = b;
            node.next.next = a;

            node = node.next.next;
        }

        return root.next;
 }
}
*/
//solution2 : recursive swap


public class leetcode24{

    public ListNode swapPairs(ListNode head){
    
        if(head != null && head.next != null){

            ListNode p = head.next;

            head.next = swapPairs(head.next.next);
            p.next = head;}

            return head;
    
    
    }
}
