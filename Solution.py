# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        
        if not head or head.next or k == 0 :
            return head
        

        for _ in range(k):
            prev = None
            tail =head
            
            while tail.next:
                tail= tail.next
                prev = prev.next

            tail.next = cur
            prev.next = None

    
        return head

            

        