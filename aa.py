from typing import List

class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        
        num_sum = 0
        count =1 
        max_num=0
        first_num = nums[0]
        max_number = max(nums)

        if first_num +1 == nums[1]:
            num_sum += first_num

        for count in range(1, len(nums)):

            while nums[count] == nums[count-1]+1:
                num_sum += nums[count]
                count += 1

            max_num = max(max_num , num_sum)
            num_sum =0


        return max_num if max_num > max_number else max_number+1 


if __name__ == "__main__":
    solution = Solution()

    input = [1,2,3,2,5]

    result = solution.missingInteger(input)

    print(result)
                       

            