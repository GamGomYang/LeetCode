from functools import cache
from typing import List
class Solution:
    def predictTheWinner(self, nums: List[int]) -> bool:

        # 문제정의 - 리스트[] 에서 player1 과 player2가 각각 
        # 가장 오른쪽수와 가장 왼쪽수를 고른다.
        # 그리고 나는 player1 이 이길수 있는지 없는지 확인하려고한다.
        # player1 승리 - Treu, 패배 - False 

        #memory DP라는 개념을 써보자 - 기존 재귀식에서 저장해서 다음에도
        #똑같은 재귀시 바로 캐싱 할 수 있도록 - functools - cache를 사용
        
        # dfs함수 정의 및 cache활성화
        # 각 경우의 수를 recursion - topdown형식이라고 함
        @cache
        def dfs(left :int , right : int) -> int:

            # bottom 도착 정의
            if left == right :
                return nums[left]

            #left 골랐을때 - player1이 left 고르고 player2가 2개중 1개를 choose
            #이 경우의수의 차이를 구하면 누가 이길지 알 수 있음
            left_choose = nums[left] - dfs(left+1, right)

            #right 골랐을때 - right를 빼고 난 뒤 player2가 2개중 1개를 고른다
            right_choose = nums[right] - dfs(left, right-1)

            return max(left_choose , right_choose)

        # 결과가 0 보다크다 -> player1-player2가 양수 - player1의 승리
        return dfs(0, len(nums)-1)>=0 
    



