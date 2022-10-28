class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
    
        dict = {}
        
        for i, n in enumerate(nums):
            remainder = target - n
            if remainder in dict:
                 return [dict[remainder], i]
            else:
                dict[n] = i

        
# [0:2, 1:7, 2:11, 3:15]
# remainder = 7
