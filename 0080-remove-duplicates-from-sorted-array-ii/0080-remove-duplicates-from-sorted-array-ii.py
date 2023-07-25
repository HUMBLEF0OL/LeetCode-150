class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=1;j=1;frequency=1
        while i<len(nums):
            if nums[i] != nums[i-1]:
                frequency=1;
                nums[j] = nums[i]
                j+=1
            elif nums[i] == nums[i-1]:
                if frequency <2:
                    frequency+=1
                    nums[j] = nums[i]
                    j+=1
            i+=1
        return j
        