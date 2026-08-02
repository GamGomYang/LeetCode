from functools import cache
from typing import List
class Solution:
    def stoneGame(self, piles: List[int]) -> bool:
        @cache #다시 호출되었던것을 그대로 다시 쓰기위해서 - 캐싱
        def dfs(left : int , right : int )-> int:

            if (left == right):
                return piles[left]

            left_choose = piles[left] - dfs(left+1 , right)
            right_choose = piles[right] - dfs(left , right-1)

            return max(left_choose , right_choose)

        return dfs(0, len(piles)-1) >0 

# if __name__ == "__main__":
#     solution = Solution()

#     piles = [5,3]

#     result = solution.stoneGame(piles)

#     print(result)