import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;


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
class ListNode{
   int val;
   ListNode next;
   ListNode(int x){val = x;}
}// ListNode 정의


class leetcode83 {
   public ListNode deleteDuplicates(ListNode head) {
      if(head == null || head.next == null){
         return head;

      }
      // 다음 노드 및 현재 노드가 null일때 예외처리


      ListNode current = head;


      while(current != null && current.next!= null){
         if(current.val == current.next.val){

            current.next = current.next.next;
         }

         else{
            current = current.next;
         }


      }

      return head;


       
   }
}