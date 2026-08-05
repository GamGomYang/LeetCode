from collections import deque
from collections import defaultdict
class Solution:
    def remainingMethods(self, n: int, k: int, invocations: List[List[int]]) -> List[int]:

        suspicious = set()
        visited = [False] * n

        dict = defaultdict(list)

        for i, j in invocations:
            dict[i].append(j)

        queue = deque()
        queue.append(k)
        suspicious.add(k)
        visited[k] = True

        while queue:

            node = queue.popleft()

            for i in dict[node]:
                if not visited[i]:
                    queue.append(i)
                    suspicious.add(i)
                    visited[i] = True

        for i in range(n):
            if i not in suspicious:
                for j in dict[i]:
                    if j in suspicious:
                        return list(range(n))

        return [i for i in range(n) if i not in suspicious]


        

            
