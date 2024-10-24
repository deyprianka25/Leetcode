class Solution {
    public int minimumOperations(int[] nums) {
        //APPROACH:PRIORITY QUEUE
          PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            if (num > 0) {
                minHeap.add(num);
            }
        }
        int operations = 0;
        while (!minHeap.isEmpty()) {
            int smallest = minHeap.poll();
            operations++;
            while (!minHeap.isEmpty() && minHeap.peek() == smallest) {
                minHeap.poll();
            }
        }
        
        return operations;
      //APPROACH:HASHSET  
       // HashSet<Integer> unique = new HashSet<>();
       // for(int num:nums){
           // if(num>0){
               // unique.add(num);
           // }
        //}
      // return unique.size(); 
}
}