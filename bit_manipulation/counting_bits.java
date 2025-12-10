/*class Solution {
    public int[] countBits(int n) {
     int[] arr=new int[n+1];
        for(int i=0;i<=n;i++)
        {  int res=0;
           int num=i;
          while(num!=0)
          { num=num&(num-1);
            res=res+1;
          }
          arr[i]=res;
        }
       return arr;
    }
}*/
public class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }
}
