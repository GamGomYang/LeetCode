from collections import deque

def solution(n, computers):
    answer=0
    visited=[False] *n

    def dfs(v):
        visited[v] = True
        for neighbor in range(n):
            if computers[v][neighbor] == 1 and not visited[neighbor]:
                dfs(neighbor)

    for i in range(n):
        if not visited[i]:
            dfs(i)
            answer +=1

    return answer

