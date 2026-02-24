class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxarea=0;
        int area=0;
        while(left<right)
        {    area=Math.min(heights[left],heights[right])*Math.abs((right-left));
            maxarea=Math.max(area,maxarea);
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {right--;
            }
           
        }
        return maxarea;
    }
}

