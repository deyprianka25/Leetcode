public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array
        for (int i = 0; i < nums.length - 1; i++) { // Loop until the second last element
            if (nums[i] == nums[i + 1]) { // Check if two consecutive elements are equal
                return true;
            }
        }
        return false; // No duplicates found
    }
}

