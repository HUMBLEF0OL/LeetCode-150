class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1,frequency=1;
        while(i<nums.length){
            if(nums[i-1] != nums[i]){
                frequency=1;
                nums[j++] = nums[i];
            }else if(nums[i] == nums[i-1]){
                if(frequency < 2){
                    frequency++;
                    nums[j++] =nums[i];
                }
            }
            i++;
        }return j;
    }
}