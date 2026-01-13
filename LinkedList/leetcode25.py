class Solution:
    def reverseKGroup(self, head, k):
        if not head or k == 1:
            return head
        
        dummy = ListNode(0)
        dummy.next = head
        prev = head

        while True:
            tail = prev
            for _ in range(k):
                tail = tail.next
                if not tail:
                    return dummy.next
            
            next_group = tail.next

            curr = prev.next
            tail.next =None
            reverse_prev = None

            while curr:
                nxt = curr.next
                curr.next = reverse_prev
                reverse_prev = curr
                curr = nxt

            old_start = prev.next
            prev.next = reverse_prev
            old_start.next = next_group
            prev = old_start