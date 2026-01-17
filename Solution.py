class Solution:
    def reverseKGroup(self, head, k):
        if not head or k == 1:
            return head

        dummy = ListNode(0)
        dummy.next = head
        prev = dummy

        while True:
            tail = prev
            for _ in range(k):
                tail = tail.next
                if not tail:
                    return dummy.next

            nxt_group = tail.next


            curr = prev.next
            tail.next = None
            p = None

            while curr:
                nxt = curr.next
                curr.next = p
                p = curr
                curr = nxt

            old_start = prev.next
            prev.next = p
            old_start.next = nxt_group
            prev = old_start
