class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        number = len(isConnected)
        visited = [False] * number
        answer =0 

        def dfs(v):
            visited[v] = True
            for neighbor in range(number):
                if isConnected[v][neighbor] == 1 and visited[neighbor] == False:
                    dfs(neighbor)
                    
        for i in range(number):
            if not visited[i]:
                dfs(i)

                answer +=1

        return answer


