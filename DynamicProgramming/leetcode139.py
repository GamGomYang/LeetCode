class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        length = len(s)

        dp = [False]*(length+1)
        wordset = set(wordDict)

        # set 이 list 탐색 보다 더 빠르다
        # set - 해시 테이블 O(1)

        dp[0] = True

        for i in range(1 , length +1):
            for j in range(i):
                if dp[j] and s[j:i] in wordset:
                    dp[i] = True

                    break

        
        return dp[length]


    


