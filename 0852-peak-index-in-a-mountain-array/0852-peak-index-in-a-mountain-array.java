class Solution {
    private static int findpeak(int[] nums,int start,int end){
        if(start==end){
            return start;
        }
        int mid = start +(end-start)/2;
        if(nums[mid]>nums[mid+1]){
            return findpeak(nums,start,mid);
        }
        else{
            return findpeak(nums,mid+1,end);
        }
    }
    public int peakIndexInMountainArray(int[] nums) {
        int ans = findpeak(nums,0,nums.length-1);
        return ans;
    }
}