from collections import defaultdict , deque
class Solution:
    def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
        graph = defaultdict(list)
        degree = defaultdict(int)

        if n == 1:
            return [0]

        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)
            degree[u] += 1
            degree[v] += 1

        queue = deque([node for node in degree if degree[node] == 1])
        
        
        while n >2:
            size = len(queue)
            n -= size
            for _ in range(size):
                leaf = queue.popleft()
                for nei in graph[leaf]:
                    degree[nei] -=1
                    if degree[nei] == 1:
                        queue.append(nei)

        return list(queue)

