from collections import deque

def bfs(start):

    queue = deque([start])
    visited[start] = True

    while queue:
        current = queue.popleft()

        for next_node in graph[current]:
            if not visited[next_node]:
                visited[next_node] = True
                queue.append(next_node)