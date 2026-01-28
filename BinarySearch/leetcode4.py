class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:

        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1

        len_1, len_2 = len(nums1), len(nums2)

        # -21470000 과 inf의 차이 inf는 없으면 없다라고 나옴 (센티넬)

        NEG_INF = float('-inf')
        POS_INF = float('inf')

        left, right = 0, len_1

        while left <= right:
            i = (left + right) // 2
            j = (len_1 + len_2 + 1) // 2 - i

            left_max  = NEG_INF if i == 0      else nums1[i - 1]
            right_min = POS_INF if i == len_1  else nums1[i]

            left2_max  = NEG_INF if j == 0      else nums2[j - 1]
            right2_min = POS_INF if j == len_2  else nums2[j]

            if left_max <= right2_min and left2_max <= right_min:
                if (len_1 + len_2) % 2 == 1:
                    return max(left_max, left2_max)
                else:
                    return (max(left_max, left2_max) +
                            min(right_min, right2_min)) / 2

            elif left_max > right2_min:
                right = i - 1
            else:
                left = i + 1
