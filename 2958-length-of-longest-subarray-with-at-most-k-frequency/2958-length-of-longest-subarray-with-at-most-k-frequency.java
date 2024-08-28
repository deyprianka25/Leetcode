class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         int len = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        int start = 0, end = 0, n = nums.length;

        while (end < n) {
            count.put(nums[end], count.getOrDefault(nums[end], 0)+1);
            while (count.get(nums[end]) > k) {
                count.put(nums[start], count.get(nums[start]) - 1); 
                start++;
            }

            len = Math.max(len, end - start + 1);
            end++;
        }

        return len;
    }
}