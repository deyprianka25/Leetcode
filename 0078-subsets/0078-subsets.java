class Solution {
    public static void subsequence(int[] nums, int index, int n, List<List<Integer>> ans, List<Integer> temp) {
        if (index == n) {
            ans.add(new ArrayList<>(temp));  // Create a new copy of temp before adding it
            return;
        }

        // Exclude the current element and move to the next
        subsequence(nums, index + 1, n, ans, temp);

        // Include the current element and move to the next
        temp.add(nums[index]);
        subsequence(nums, index + 1, n, ans, temp);

        // Backtrack and remove the element before the next recursion step
        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsequence(nums, 0, nums.length, ans, temp);  // Use nums.length instead of nums.size()
        return ans;
    }
}