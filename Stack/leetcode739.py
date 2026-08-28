from typing import List

class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:

        result = [1] * len(temperatures)

        stack = []

        for i in range(len(temperatures)):

            while stack and temperatures[stack[-1]] < temperatures[i]:
                idx = stack.pop()
                result[idx] = i - idx

            stack.append(i)

        while stack :
            result[stack.pop()] = 0
            

        return result 

if __name__ == "__main__":
    solution = Solution()
    temperatures = [20,21,31,4,1,4,3]

    result = solution.dailyTemperatures(temperatures)

    print(result)
