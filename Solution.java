import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 두 리스트를 뒤집음
        ListNode l1Reversed = reverseList(l1);
        ListNode l2Reversed = reverseList(l2);

        // 두 리스트를 정수로 변환 후 덧셈
        BigInteger result = toBigInt(l1Reversed).add(toBigInt(l2Reversed));

        // 결과를 뒤집힌 리스트로 변환
        return toReversedLinkedList(result);
    }

    // 리스트 뒤집기
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, node = head;

        while (node != null) {
            ListNode next = node.next; // 다음 노드 저장
            node.next = prev;         // 현재 노드가 이전 노드를 가리킴
            prev = node;              // 이전 노드 업데이트
            node = next;              // 다음 노드로 이동
        }
        return prev; // 뒤집힌 리스트의 첫 노드
    }

    // 리스트를 BigInteger로 변환
    public BigInteger toBigInt(ListNode node) {
        StringBuilder val = new StringBuilder();

        while (node != null) {
            val.append(node.val); // 각 노드 값을 문자열로 연결
            node = node.next;
        }

        return new BigInteger(val.toString()); // 문자열을 정수로 변환
    }

    // BigInteger를 뒤집힌 리스트로 변환
    public ListNode toReversedLinkedList(BigInteger val) {
        ListNode prev = null;

        for (char c : val.toString().toCharArray()) {
            ListNode node = new ListNode(Character.getNumericValue(c)); // 각 문자 -> 숫자로 변환
            node.next = prev; // 현재 노드가 이전 노드를 가리킴
            prev = node;      // 이전 노드 업데이트
        }

        return prev; // 리스트의 첫 노드 반환
    }
}
