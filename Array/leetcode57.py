from typing import List

class Solution:
    def insert(self, intervals: List[List[int]],newInterval: List[int])-> List[List[int]]:

        res =[]



        for i in range(len(intervals)):
        # 1. newInterval 이 intervals의 범위에 속하지 않는 경우 
            
            # 1.1 newInterval 이 intervals보다 작은 경우
            if newInterval[1]<intervals[i][0]:
                res.append(newInterval)
                return res+intervals[i:]

            # 1.2 newInterval이 intervals보다 큰 경우
            elif newInterval[0]>intervals[i][1]:
                res.append(intervals[i])

            # 2. newInterval과 intervals의 구역이 겹치는 경우
            else:
                newInterval = [min(newInterval[0],intervals[i][0]),max(newInterval[1],intervals[i][1])]
            
        res.append(newInterval)
        return res