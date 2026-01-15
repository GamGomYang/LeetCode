class Solution:
    def subarraySum(self, nums, k):
        from collections import defaultdict

        count = defaultdict(int)

        count [0] = 1

        cur_sum = 0
        answer = 0

        for x in nums:
            cur_sum += x

            if (cur_sum - k) in count:
                answer += count[cur_sum - k]

            count[cur_sum] +=1

        return answer 