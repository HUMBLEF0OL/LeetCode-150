class Solution {
    public int removeDuplicates(int[] nums) {
        int j =1,i=1,count= 1;
        for(;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j++] = nums[i];
                count++;
            }
        }
        return count;
    }
}