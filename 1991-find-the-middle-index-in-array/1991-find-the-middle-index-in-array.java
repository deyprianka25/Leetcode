class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int n:nums) sum+=n;
        int left = 0;
        int right = sum;
        for(int i=0;i<nums.length;i++){
            right -= nums[i];
            if(left == right) return i;
            left += nums[i];
            
        }
        return -1;
    }
}