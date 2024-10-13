class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            result[i] = getsum(nums,i,i+k-1,x);
        }
      return result;  
    }
     public int getsum(int[] nums, int start, int end, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = start; i <= end; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Pair<Integer, Integer>> priorityQueue = new PriorityQueue<Pair<Integer, Integer>>((a, b) -> {
            if (a.getValue() == b.getValue()) {
                return -Integer.compare(a.getKey(), b.getKey());
            }
            return -Integer.compare(a.getValue(), b.getValue());
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.offer(new Pair(entry.getKey(), entry.getValue()));
        }

        int sum = 0;
        while (x > 0 && !priorityQueue.isEmpty()) {
            Pair<Integer, Integer> pair = priorityQueue.poll();
            sum = sum + pair.getKey() * pair.getValue();
            x--;
        }
        return sum;
    }
}
