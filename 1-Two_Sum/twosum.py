# Solved 2026/06/06
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        remainders = []
        for index, num in enumerate(nums):
            if (num) in remainders:
                return [index, remainders.index(num)]
            remainders.append(target - num)
