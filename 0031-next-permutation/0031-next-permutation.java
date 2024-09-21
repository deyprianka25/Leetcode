class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        if (i >= 0) { // If i >= 0, we have found a decreasing element
            // Step 2: Find the element just larger than nums[i]
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap the found elements nums[i] and nums[j]
            swap(nums, i, j);
        }
        
        // Step 4: Reverse the elements from i + 1 to the end of the array
        reverse(nums, i + 1, nums.length - 1);
    }

    // Helper method to swap elements at indices i and j
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper method to reverse elements between indices i and j
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
