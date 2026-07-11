class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:

        result = []
        path = []

        def dfs(start, total):
            if total == n and len(path) == k:
                result.append(path[:])
                return
        
            for i in range(start, 10):
                if total + i > n :
                    break
                path.append(i)
                dfs(i+1, total + i)
                path.pop()
        
        



	return result
