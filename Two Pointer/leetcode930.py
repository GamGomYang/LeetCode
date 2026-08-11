class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
# 슬라이딩 윈도우 - left , right 를 통해 해를 도출하는방법
# 합이 k 이하 k이상 , 길이가 k이하 k이상 인것을 잘 찾을 수 있음.
        def atMost(k):
            if k < 0:
                return 0
# 정확히 합이 k인것은 찾기가 어려움 -> (k) - (k-1) 을 통해 해 도출
# 정확히 세기 어렵다면 , 더 넓은 범위를 세고 빼는 방법을 생각해본다.
# 슬라이딩윈도우 - 경계선 찾는 일 -> k 이하 와 같은것을 잘 찾음.
            left = 0
            current_sum = 0
            count = 0

            for right in range(len(nums)):
                current_sum += nums[right]

                while current_sum > k:
                    current_sum -= nums[left]
                    left+=1

                count += right - left +1

            return count

        return atMost(goal) - atMost(goal-1)