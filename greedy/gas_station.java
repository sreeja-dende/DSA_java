class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int total_gas=0;
      int total_cost=0;
      int current=0;
      int start=0;
       for(int i=0;i<gas.length;i++)
       {
          total_gas +=gas[i];
           total_cost +=cost[i];
           current=current+gas[i]-cost[i];
           if(current<0)
           { 
            current=0;
            start=i+1;
           }
       }
      if(total_gas<total_cost)
      { return -1; //circle cannot be completed 
      }
      else
      {return start; //circle cn be completed but from which index start
      }

    }
}
