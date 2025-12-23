class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(String word: strs){
            int []count=new int[26];
             for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder keybuilder=new StringBuilder();
            for(int freq:count)
            { keybuilder.append(freq).append('#');
             }
         String key=keybuilder.toString();
        map.computeIfAbsent(key,k->new ArrayList()).add(word);
     }
    List<List<String>> result=new ArrayList<>();
    for(List<String> group:map.values())
    {
        result.add(group);
    } return result;
}
}
