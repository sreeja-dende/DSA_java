class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result =new ArrayList<>();
        for(int[] interval:intervals)
        {if(interval[1]<newInterval[0])
          {result.add(interval); //checking if they overlap
          }
          else if(interval[0]>newInterval[1])
          {    //checking if they overlap with secondcondition
            result.add(newInterval);//interval[1]<newInterval[0] though this condition it may sometimes not overlap so check for other condition(3,4)interval new interval-(1,2) they dont overlap 
            newInterval=interval;
          }
          else
          { //overlap
             newInterval[0]=Math.min(interval[0],newInterval[0]);
             newInterval[1]=Math.max(interval[1],newInterval[1]);
          }
        }
        result.add(newInterval);
         return result.toArray(new int[result.size()][]);
    }
}
