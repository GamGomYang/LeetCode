#solution1 - union find

class Solution:
    def pathExistenceQueries(self, n: int, \
                             nums: List[int], maxDiff: int, \
                             queries: List[List[int]]) -> List[bool]:
        
        
        #union find 구현
        parent = list(range(n))
        
        def find(x):
            if parent[x] != x:
                parent[x] = find(parent[x])
            return parent[x]
            
        def union(a,b):
            root_a = find(a)
            root_b = find(b)
            
            if root_a != root_b:
                parent[root_b] = root_a
        
        for i in range(n-1):
            if nums[i+1] - nums[i] <= maxDiff:
                union(i, i+1)
                
        result = []
        
        for a,b, in queries:
            result.append(find(a) == find(b))
            
        return result
    
#solution2 - array
    
class Solution:
    def pathExistenceQueries(self, n: int, nums: List[int], maxDiff: int, queries: List[List[int]]) -> List[bool]:
        pre=[0]*n
        for i in range(1,n):
            if nums[i] - nums[i-1] <= maxDiff:
                pre[i] = pre[i-1]
            else:
                pre[i] = pre[i-1]+1
        
        result = []
        
        for a,b in queries:
            result.append(pre[a] == pre[b])
        return result
            
    
                
        
                
        