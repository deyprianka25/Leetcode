class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid is greater than its neighbors, mid is a peak
            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Search in the left half
            } else {
                left = mid + 1; // Search in the right half
            }
        }
        
        return left; // When left == right, it's the peak
    }
}