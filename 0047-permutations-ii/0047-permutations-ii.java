class Solution {
   public static void permutation(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] visited) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));  // Add a copy of the current permutation to the answer
            return;
        }
        boolean[] used = new boolean[21];  // Track which numbers are used (adjusted for range -10 to 10)
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i] && !used[nums[i] + 10]) {  // Skip duplicates and already visited numbers
                visited[i] = true;
                temp.add(nums[i]);
                used[nums[i] + 10] = true;  // Mark this number as used for this level
                permutation(nums, ans, temp, visited);
                visited[i] = false;  // Backtrack
                temp.remove(temp.size() - 1);  // Remove the last added element
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to handle duplicates
        permutation(nums, ans, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }
}