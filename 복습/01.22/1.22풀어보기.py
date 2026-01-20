'''
#1 merge list

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        def merge(l1 , l2):
            start = ListNode(0)
            first = start

            while l1 and l2 :
                if l1.val >= l2.val:
                    start.next = l2
                    l2 = l2.next
                    start = start.next
                    #start pointer 이동하는거 까먹지 말기
                else:
                    start.next = l1
                    l1 = l1.next
                    start = start.next

            if l1 :
                start.next = l1
            else:
                start.next = l2

            return first.next

        def split_list(head):
            if not head or not head.next:
                return head

            slow = head
            fast = head.next

            while fast and fast.next:
                slow = slow.next
                fast = fast.next.next

            l1 = head 
            l2 = slow.next
            slow.next = None

            return merge(split_list(l1) , split_list(l2))
        # 재귀식의 방식 - 마지막 최소 조건 걸고 함수 콜하기

        

        return split_list(head)

        

#2 decode string
from collections import deque

class Solution:
    def decodeString(self, s: str) -> str:

        stack = []
        current_str = ""
        current_num = 0 

        for x in s:

            if x.isdigit():
                current_num = current_num *10 + int(x)
            elif x == '[':
                stack.append((current_str, current_num))
                current_str = ""
                current_num = 0
            elif x == ']':
                prev_str , num = stack.pop()
                current_str = prev_str + current_str * num

            else:
                current_str += x

        return current_str           

        

'''
        

        

        