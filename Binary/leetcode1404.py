class Solution:
    def numSteps(self, s: str) -> int:
        num = int(s, 2)
        # 2진수로 만드려면 num = int(s , 2) 이렇게 해야함
        steps = 0

        while num > 1:
            if num & 1:     
                num += 1
            else:            
                num >>= 1    

            steps += 1

        return steps