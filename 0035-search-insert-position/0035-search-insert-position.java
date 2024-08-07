class Solution {
    public int searchInsert(int[] nums, int target) {
      int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // This avoids potential overflow
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start; // When start > end, start is the correct insertion point
    }
}