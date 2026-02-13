from typing import List

class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        
        def dfs(start, path, depth):
            print("  " * depth + f"[호출] 시작위치={start}, 현재경로={path}")
            
            # 현재 부분집합 저장
            result.append(path[:])
            print("  " * depth + f"→ 부분집합 저장: {path[:]}")
            
            for i in range(start, len(nums)):
                
                # 🔥 중복 제거
                if i > start and nums[i] == nums[i-1]:
                    print("  " * depth + f"⚠️ 중복 건너뜀: nums[{i}]={nums[i]}")
                    continue
                
                print("  " * depth + f"✔ 선택: nums[{i}]={nums[i]}")
                path.append(nums[i])
                
                dfs(i+1, path, depth+1)
                
                print("  " * depth + f"↩ 되돌아감 (pop {path[-1]})")
                path.pop()
        
        dfs(0, [], 0)
        return result


# 실행 예제
nums = [1,2,2]
sol = Solution()
res = sol.subsetsWithDup(nums)

print("\n최종 결과:")
print(res)
