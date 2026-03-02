from collections import defaultdict ,  deque

class Solution:

    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        
        if endWord not in wordList:
            return 0
        
        pattern_map = defaultdict(list)
        for word in wordList:
            #string은 key값이 되지만 list는 immutable이라 안됨
            for i in range(len(word)):
                pattern = word[:i] + '_' + word[i+1:] 
                pattern_map[pattern].append(word)

        
        queue= deque([(beginWord, 1)])
        # queue에는 튜플이 들어가야함 - 그것을 감싸는 박스 [] 기억해야함
        visited = set([beginWord])


        while queue :
            word, level = queue.popleft()

            for i in range(len(word)):
                pattern = word[:i] + '_' + word[i+1:]
                
                for nei in pattern_map[pattern]:
                    if nei == endWord:
                        return level+1
                    
                    if nei not in visited:
                        visited.add(nei)
                        queue.append((nei,level+1))
        return 0
                    
                    
            


                