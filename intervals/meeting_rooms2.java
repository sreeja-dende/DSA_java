/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
       int n = intervals.size();

        int[] starts = new int[n];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
      Arrays.sort(starts);
      Arrays.sort(ends);
       int i = 0, j = 0;
        int days = 0, maxDays = 0;

        while (i < intervals.size()) {
            if (starts[i] < ends[j]) {
                days++;
                maxDays = Math.max(maxDays, days);
                i++;
            } else {
                days--;
                j++;
            }
        }
        return maxDays;

    }
}
