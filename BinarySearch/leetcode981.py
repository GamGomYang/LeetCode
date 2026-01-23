'''
#LTC981 Time Based Key-Value Store
    1. 같은 key에 대해 timestamp는 항상 증가 순서로 들어온다.
    2. get은 정확한 timestamp매칭이 아니라 그중 가장 큰 값을 출력하는것

    set 으로 하면? - set은 정렬 및 크기 비교를 지원하지 않는다. 이진 탐색도 안됨
                    즉 index 지원을 하지 않는다.
    가장 큰 값 찾기 - 이진 탐색

'''
from collections import defaultdict
import bisect
class TimeMap:

    def __init__(self):
        self.store = defaultdict(list)
        
    def set(self, key: str, value: str, timestamp: int) -> None:
        self.store[key].append((timestamp, value))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.store:
            return ""
        
        arr = self.store[key]

        # bisect -> list 나 튜플 비교후 그값에서 오른쪽으로 이동 - bisect.right
        idx = bisect.bisect_right (arr , (timestamp, chr(127)))-1

        '''
        다른 방법 - 이진탐색
        l, r = 0 , len(arr)-1

        while l <= r:
            mid = (l+r)//2
            if arr[mid][0] <= timestamp:
                l = mid +1
            else:
                r = mid -1
        return arr[r][1] if r>=0 else ""

        '''

        if idx < 0 :
            return ""
        
        return arr[idx][1]
        


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)