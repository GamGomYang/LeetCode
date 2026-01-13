# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        
        if not head or not head.next or k == 0 :
            return head
        
        tail = head
        cnt = 1

        while tail.next :
            tail = tail.next
            cnt +=1

        k %= cnt

        tail.next = head

        step = cnt - k

        new_tail = head

        for _ in range(step - 1):
            new_tail = new_tail.next

        new_head = new_tail.next
        new_tail.next = None

        return new_head






            

        