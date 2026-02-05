//2 conditions 
//each letter appears in the substring is limited to that substring shoukd not appear in other string
//char at left should not appaear to right 
class Solution {
    public List<Integer> partitionLabels(String s) {
      int last[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        last[s.charAt(i)-'a']=i;
      }
      int end=0;
      int start=0;
       List<Integer> result = new ArrayList<>();
       for(int i=0;i<s.length();i++)
       {
        end=Math.max(end, last[s.charAt(i)-'a']);
        if(end==i)
        {
            result.add(end - start + 1);
                start = i + 1; 
        }
       }
       return result;   
}
}

