class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       List<int[]> result=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
       int current[]=intervals[0];
       int count=0;
        for (int i = 1; i < intervals.length; i++) {
            
            if (current[1] > intervals[i][0]) {
                count=count+1;
               
            } else {
                
                result.add(current);
                current = intervals[i];
                 
            }
        }
  result.add(current);
  return count;
    }
}
