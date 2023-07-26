class Solution:
    def rotateElements(self,nums,start,end) -> None:
        while start<end:
            temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start+=1
            end-=1
            
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        k = k % len(nums);
        if k == 0:
            return
        # step-1 rotate the whole array
        self.rotateElements(nums,0,length-1);
        
        # step-2 rotate starting k elements of the array
        self.rotateElements(nums,0,k-1);
        # step-3 rotate the rest of the elements of the array
        self.rotateElements(nums,k,length-1);
        