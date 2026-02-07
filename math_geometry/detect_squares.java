class CountSquares {
   HashMap<String,Integer> freq;
    public CountSquares() {
        freq= new HashMap<>();
    }
    
    public void add(int[] point) {
        int x=point[0];
        int y=point[1];
        String key=x+","+y;
        freq.put(key,freq.getOrDefault(key,0)+1);


    }
    
    public int count(int[] point) {
        int x=point[0];
        int y=point[1];
        int ans=0;
        for(String key:freq.keySet())
        {  int px = Integer.parseInt(key.split(",")[0]);
            int py = Integer.parseInt(key.split(",")[1]);
            
            if(px==x && py!=y)
            {
                int d=Math.abs(py-y);
                  ans += freq.get(key)
                     * freq.getOrDefault((x + d) + "," + y, 0)
                     * freq.getOrDefault((x + d) + "," + py, 0);

                ans += freq.get(key)
                     * freq.getOrDefault((x - d) + "," + y, 0)
                     * freq.getOrDefault((x - d) + "," + py, 0);
            }
        } 
        return ans;

    }
}
