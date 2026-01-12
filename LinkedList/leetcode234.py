# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:

        if not head :
            return False
        
        slow =head
        fast = head.next

        while fast and fast.next :
            slow = slow.next
            fast = fast.next.next

        right = slow.next
        left = head
        prev = None
        cur = right
        while cur:
            nxt = cur.next
            cur.next = prev
            prev = cur
            cur = nxt
            
        right = prev

        while left and right:
            if left.val == right.val:
                 
                left = left.next
                right = right.next
                
            else:
                return False
        
        return True
        
