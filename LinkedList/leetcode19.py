# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0,head)
        fast = slow = dummy

        for i in range(n):
            fast = fast.next
        
        while fast.next:
            slow = slow.next
            fast = fast.next

        # 원래의 slow.next는 자동으로 삭제되고 slow.next.next로 갱신되어짐
        slow.next = slow.next.next
        
        return dummy.next
        
        

