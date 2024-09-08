class Solution {
    private static int solve(int[] nums,int s,int e, int k){
        if(s>e){
            return s;
        }
        int mid = s+(e-s)/2;
        if(nums[mid]==k){
            return mid;
        }
        if(nums[mid]<k){
            return solve(nums,mid+1,e,k);
        }
        else{
            return solve(nums,s,mid-1,k);
        }
    }
    public int searchInsert(int[] nums, int target) {
      int ans = solve(nums,0,nums.length-1,target);
        return ans;
    }
}