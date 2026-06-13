# Solved 2026/06/13
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diffs = {}
        for index, num in enumerate(nums):
            if num in diffs:
                return [diffs[num], index]
            diffs[target - num] = index
