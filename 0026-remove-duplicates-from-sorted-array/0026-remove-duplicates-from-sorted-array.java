class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j=1;
        int k=1;
        while(j<nums.length)
        {
            if(nums[j]==nums[j-1])
            {
                j++;
            }
            else if(nums[j]!=nums[j-1])
            {
                nums[k]=nums[j];
                j++;
                k++;
            }
        }
        return k;
    }
}