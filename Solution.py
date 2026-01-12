# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        
        slow = head 
        fast = head.next

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        
        right = slow.next
        left = head
        slow.next = None

        prev = None
        cur = right 

        while cur:
            nxt = cur.next
            cur.next = prev
            prev = cur 
            cur = nxt

        right = prev
        

        while right:
            nxt_1 = left.next
            nxt_2 = right.next
            left.next = right
            left = nxt_1
            right.next = left 
            right = nxt_2

        


