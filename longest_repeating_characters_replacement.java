class Solution {
    public int characterReplacement(String s, int k) {
       int left=0;
       int maxcount=0;
       int maxlen=0;
       HashMap<Character,Integer> map=new HashMap<>();
       for(int right=0;right<s.length();right++)
       {   char rChar = s.charAt(right);
            map.put(rChar, map.getOrDefault(rChar, 0) + 1);
             maxcount = Math.max(maxcount, map.get(rChar));
             while ((right - left + 1) - maxcount > k) {

                char lChar = s.charAt(left);
                map.put(lChar, map.get(lChar) - 1);
                left++;
            }
             maxlen = Math.max(maxlen, right - left + 1);

       } 
       return maxlen;
    }
}
