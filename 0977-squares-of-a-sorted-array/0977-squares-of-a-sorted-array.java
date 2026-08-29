class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0,j=nums.length-1;
        int last=nums.length-1;
        while(i<=j)
        {
            if(Math.abs(nums[i])<nums[j])
            {
                ans[last]=nums[j]*nums[j];
                j--;
                last--;
            }
            else{
                ans[last]=nums[i]*nums[i];
                i++;
                last--;
            }
        }
        return ans;

      
        
    }
}