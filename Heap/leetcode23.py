import heapq

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        heap = []
        for i , node in enumerate(lists):
            # none일때 인식 안되기 때문에 none처리 해야한다.
            if node:
                heapq.heappush(heap, (node.val , i , node))

        dummy = ListNode(0)
        current = dummy

        while heap: 
            val , i , node = heapq.heappop(heap)
            current.next = node 
            current = current.next

            if node.next:
                heapq.heappush(heap , (node.next.val , i , node.next))

        return dummy.next


