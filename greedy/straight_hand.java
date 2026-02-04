class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       int n = hand.length;

        // Base condition
        if (n % groupSize != 0) return false;

        // Count frequencies
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        // Keep keys in a min-heap to get smallest card easily
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(countMap.keySet());

        while (!minHeap.isEmpty()) {
            int start = minHeap.peek(); // smallest card

           
            for (int i = 0; i < groupSize; i++) {
                int card = start + i;

                if (!countMap.containsKey(card)) return false; // missing card

               
                countMap.put(card, countMap.get(card) - 1);
                if (countMap.get(card) == 0) {
                    countMap.remove(card);
                    minHeap.remove(card); 
       
                   }
            }
        }
        return true;
}
}
        
