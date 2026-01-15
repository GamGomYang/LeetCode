class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph = [[] for _ in range(numCourses)]

        for a, b in prerequisites:
            graph[b].append(a)

            '''
            graph = [
                    [2],   # 0 → 2
                    [2],   # 1 → 2
                    []     # 2
                    ]
            '''

        state = [0]*numCourses
        
        def dfs(course):
            if state[course] == 1:
                return False

            if state[course] == 2:
                return True
            
            state[course] = 1

            for nxt in graph[course]:
                if not dfs(nxt):
                    return False
                
            state[course] = 2
            return True
        
        for i in range(numCourses):
            if not dfs(i):
                return False
            
        return True