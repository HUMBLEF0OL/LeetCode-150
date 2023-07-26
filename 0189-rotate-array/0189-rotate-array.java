class Solution {
    private void rotateElements(int nums[],int startIndex,int endIndex){
        while(startIndex<endIndex){
            int temp = nums[startIndex];
            nums[startIndex++] = nums[endIndex];
            nums[endIndex--] = temp;
            
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k == 0)return;
        // step-1 rotate the whole array
        rotateElements(nums,0,nums.length-1);
        
        // step-2 rotate starting k elements of the array
        rotateElements(nums,0,k-1);
        // step-3 rotate the rest of the elements of the array
        rotateElements(nums,k,nums.length-1);
        
    }
}