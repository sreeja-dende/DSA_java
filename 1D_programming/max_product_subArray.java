class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {   int tempmax=max;
            max=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min=Math.min(nums[i],Math.min(nums[i]*tempmax,nums[i]*min));
           result=Math.max(result,max);
        }
        return result;
    }
}
