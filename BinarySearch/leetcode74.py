class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m , n = len(matrix) , len(matrix[0])

        left , right = 0 , (m*n)-1

        while left <= right:

            mid = (left + right)//2

            row = mid // n
            col = mid % n 

            val = matrix[row][col]

            if val == target :
                return True
            
            if val >= target:
                right = mid -1
            if val <= target:
                left = mid+1

        return False

            