class Solution {
    public String minWindow(String s, String t){
      int left=0;
      int right=0;
      int[] freq=new int[128];
      int need=t.length();
       int minlen = Integer.MAX_VALUE;
       int start=0;
      for(int i=0;i<t.length();i++)
      { char c=t.charAt(i); 
         freq[c]++;
      }
      while(right<s.length())
      { char ch=s.charAt(right);
         if(freq[ch]>0)
         {need--;
         }freq[ch]--;
           right++;
         while(need==0)
         { if(right-left<minlen)
          { minlen=right-left;
            start=left;
          }
         char c=s.charAt(left);
         freq[c]++;
         if(freq[c]>0)
         {need++;
         }
           left++;
         }
       }
         if(minlen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minlen);
    }
}
