import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

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
class Solution {
    public ListNode sortList(ListNode head) {
if(head == null){
    return null;
}

int cnt =0;
ListNode node = head;




while(node !=null){
    cnt++;
    node = node.next;
}


int[] arr = new int [cnt];

node = head;

for(int i=0; i<cnt; i++){
    arr[i] = node.val;
    node = node.next;
}


Arrays.sort(arr);

ListNode dummyHead = new ListNode(0);
ListNode current = dummyHead;




for(int val: arr){
    current.next = new ListNode(val);
    current = current.next;
}


return dummyHead.next;

        
    }
}