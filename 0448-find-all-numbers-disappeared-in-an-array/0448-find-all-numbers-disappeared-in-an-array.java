class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int k=Math.abs(nums[i]);
            nums[k-1]=-1*Math.abs(nums[k-1]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
}