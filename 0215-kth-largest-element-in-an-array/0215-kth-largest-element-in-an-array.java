class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int index = nums.length-k;
        return nums[index];
    }
}
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //for(int i = 0; i < k; i++){
           // pq.add(nums[i]);  
        //}
        //for(int i = k; i < nums.length; i++){  
           // if(nums[i] > pq.peek()){  
              //  pq.poll();  
                //pq.add(nums[i]);  
           // }
       // }
       // int ans = pq.peek();  
        //return ans;
        
   // }
//}