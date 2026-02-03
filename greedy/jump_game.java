class Solution {
    public boolean canJump(int[] nums) {
       int far=0;
        for(int i=0;i<nums.length;i++)
        { if(i>far)
          {return false;}
          else
          {
            far=Math.max(i+nums[i],far);
          }
        }
       return true; 
        
    }
}
