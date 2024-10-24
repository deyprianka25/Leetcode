class Solution {
    public int maxProduct(int[] nums) {
        //APPROACH:PRIORITY QUEUE
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            pq.add(num);
        }
        int max1 = pq.poll();
        int max2 = pq.poll();
        return (max1-1)*(max2-1);
        //APPROACH:SORTING
        //Arrays.sort(nums);
        //int n = nums.length;
        //return (nums[n-1]-1)*(nums[n-2]-1);
        
    }
}