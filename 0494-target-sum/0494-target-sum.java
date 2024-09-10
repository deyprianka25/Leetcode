class Solution {
    public static int find(int[] nums,int index,int n,int target){
         if (index == n) {
            return target == 0 ? 1 : 0;
        }
        int includePositive = find(nums, index + 1, n, target - nums[index]);
        int includeNegative = find(nums, index + 1, n, target + nums[index]);
        return includePositive + includeNegative;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return find(nums,0,nums.length,target);
        
    }
}