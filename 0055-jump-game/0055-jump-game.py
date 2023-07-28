class Solution {
    public boolean canJump(int[] nums) {
        int goodIndex = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i] >= goodIndex) goodIndex = i;
        }
        return goodIndex == 0;
    }
}