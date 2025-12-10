class Solution {
    public int reverse(int x) {
       int res=0;
       while(x!=0)
       { int q=x%10;
         x=x/10;
         if(res>Integer.MAX_VALUE/10)
         return 0;
         else if(res==Integer.MAX_VALUE/10&& q>7)
         return 0;
         else if(res<Integer.MIN_VALUE/10)
         return 0;
         else if(res<Integer.MIN_VALUE/10 && q<-8)
         return 0;
         
        res=res*10+q;
       }
       return res;
    }
}
