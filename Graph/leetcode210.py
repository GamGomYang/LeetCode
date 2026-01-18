from collections import defaultdict
class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        graph = defaultdict(list)

        for a, b in prerequisites:
            graph[b].append(a)

        result = []

        
        state = [0]*numCourses

        def dfs(course):
            if state[course] == 1:
                return False
            if state[course] == 2:
                return True
            
            state[course] =1

            for nxt in graph[course]:
                if not dfs(nxt):
                    return False
            
            state[course] = 2
            result.append(course)

            return True
        
        for i in range(numCourses):
            if state[i] == 0:
                if not dfs(i):
                    return []
        
        return result[::-1]



