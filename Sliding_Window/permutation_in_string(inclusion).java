class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int n=s1.length();
      int[] freq1=new int[26];
      int[] freq2=new int[26];
      if(s1.length()>s2.length()) return false;
      for(int i=0;i<n;i++)
      { char c1=s1.charAt(i);
         freq1[c1-'a']++;
      } 
      for(int i=0;i<n;i++)
      {  char c2=s2.charAt(i);
        freq2[c2-'a']++;
      }
      if(Arrays.equals(freq1,freq2))
      {return true;
      }
       for (int i = n; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
             freq2[s2.charAt(i - n) - 'a']--;
            if (Arrays.equals(freq1, freq2))
                return true;
        }

     return false;
    }
}
