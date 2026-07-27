class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        check = set()
        max_length = 0
        length = 0

        for i in nums :
            check.add(i)

        for num in check:
            if num - 1 not in check:
                length = 1
                current_num = num

                while current_num +1 in check:
                    current_num +=1
                    length +=1 

            max_length = max(max_length , length)

        return max_length

                
            
            