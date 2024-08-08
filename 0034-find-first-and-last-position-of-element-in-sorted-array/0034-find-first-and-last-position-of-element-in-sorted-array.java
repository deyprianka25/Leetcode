class Solution {
    public int[] searchRange(int[] nums, int target) {
     int start = 0;
        int end = nums.length - 1;
        int first = -1;
        int last = -1;
        int mid;

        // Find the first occurrence
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Reset start and end to search for the last occurrence
        start = 0;
        end = nums.length - 1;

        // Find the last occurrence
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}
