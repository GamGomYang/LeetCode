#1번 풀이
class Solution:
    def arrayPairSum(self,nums: List[int])-> int:
        sum =0
        pair =[]
        nums.sort()

        for n in nums: 
            pair.append(n)
            if len(pair) ==2:
                sum+= min(pair)
                pair[pair]

        return sum        
    

#2번 풀이 
#class Solution:
#    def arrayPairSum(self,nums:List[int])-> int:
#        return sum(sorted(nums)[::2])

    