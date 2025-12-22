class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
        { int num1=nums[i];
          int num2=target-num1;
         
           if(map.containsKey(num2))
           {result[0]=map.get(num2);
             result[1]=i;
             return result;
           }
           map.put(num1,i);
        }
   return result; 
   }
}
