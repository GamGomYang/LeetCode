# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # exception branch
        if not head or not head.next:
            return head
    
        slow, fast = head, head.next
        while fast and fast.next :
            slow = slow.next
            fast = fast.next.next

        mid = slow 
        right = slow.next
        mid.next = None
        left_sorted = self.sortList(head)
        right_sorted = self.sortList(right)

        return self.merge(left_sorted , right_sorted)
    
    # merge sort -> recursion 
    def merge(self, l1 , l2):
        dummy = ListNode(0)
        curr = dummy
        
        while l1 and l2:
            if l1.val <= l2.val:
                curr.next = l1
                l1 = l1.next

            else:
                curr.next = l2
                l2 = l2.next
            
            curr = curr.next
        
        if l1 :
            curr.next = l1
        else :
            curr.next = l2

        return dummy.next
