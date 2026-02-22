import heapq
from collections import Counter , deque
class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:

        count = Counter(words)
        #counter는 딕셔너리 - values를 해야함
        #그리고 word , freq모두 heap에 포함 그래서 item 즉 deque의 item함수 사용하자
        max_heap = []

        for word, freq in count.items():
            heapq.heappush(max_heap, (-freq , word))

        heapq.heapify(max_heap)
        result = []

        for _ in range(k):
            time , word = heapq.heappop(max_heap)
            result.append(word)

        return result



        