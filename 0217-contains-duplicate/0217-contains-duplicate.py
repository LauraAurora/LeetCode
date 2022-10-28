class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
    
        s = set()
        
        #for-loop using the range and length function
        for i in range(len(nums)):
            if nums[i] in s:
                return True
            
            if nums[i] not in s:
                s.add(nums[i])
        
        return False
            
            