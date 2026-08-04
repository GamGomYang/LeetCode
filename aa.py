from typing import List
from bisect import bisect_right

class Solution:
    def countTasks(self, tasks: List[int], shifts: List[int]) -> List[int]:
        drelvanito = (tasks, shifts)

        prefix = []
        total = 0

        for task in tasks:
            total += task
            prefix.append(total)

        answer = []
        work_done = 0

        for shift in shifts:
            remaining_time = total - work_done

            if shift >= remaining_time:
                answer.append(0)
                work_done = 0

            else:
                work_done += shift

                completed = bisect_right(prefix, work_done)

                unfinished = len(tasks) - completed
                answer.append(unfinished)

        return answer