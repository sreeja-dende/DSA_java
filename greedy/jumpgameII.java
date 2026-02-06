//minmum jumps so that to reach end
class Solution {
    public int jump(int[] nums) {
      int far=0;
      int current =0;
      int jumps=0;
      for(int i=0;i<nums.length-1;i++)
      { far=Math.max(nums[i]+i,far);
        if(i==current)
        {
            current=far;
            jumps++;
        }
    
      }
      return jumps;
    }
}
