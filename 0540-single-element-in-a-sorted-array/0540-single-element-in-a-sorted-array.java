class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid is even, compare mid with the next element
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2; // Skip two elements
                } else {
                    right = mid; // Single element is on the left side
                }
            } else { // If mid is odd, compare mid with the previous element
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1; // Skip one element
                } else {
                    right = mid; // Single element is on the left side
                }
            }
        }
        
        return nums[left]; // Single element found
    }
}