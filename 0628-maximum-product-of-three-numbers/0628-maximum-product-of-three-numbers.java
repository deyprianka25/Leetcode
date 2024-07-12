class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);

        int n = nums.length;

        // Maximum product can be either:
        // 1. The product of the three largest numbers.
        // 2. The product of the two smallest numbers (could be negative) and the largest number.
        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        int product2 = nums[0] * nums[1] * nums[n-1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }
}