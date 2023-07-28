class Solution:
    def canJump(self, nums: List[int]) -> bool:
        goodIndex = len(nums)-1
        for i in range(len(nums)-1,-1,-1):
            if nums[i]+i >= goodIndex:
                goodIndex = i
        
        return goodIndex == 0