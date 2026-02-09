class Solution {
    public int numDecodings(String s) {
       if(s.length()==0 || s==null)
       { return 0;
       }
        int n=s.length();
        int[] dp=new int[n+1];
        dp[n]=1;
        dp[n-1]=s.charAt(n-1)!='0' ? 1 : 0;
        for(int i=n-2;i>=0;i--)
        { if(s.charAt(i)=='0')
          {  dp[i]=0;
          }
          else{
          dp[i]=dp[i+1];
          int twodigit=Integer.parseInt(s.substring(i,i+2));
            if(twodigit>=10 && twodigit<=26)
            {  
                dp[i]=dp[i]+dp[i+2];
            }
          }
        }
        return dp[0];
    }
}
