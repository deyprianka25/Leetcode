class Solution {
     public static void permutation(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] visited) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));  // add a new copy of temp to ans
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {  // if nums[i] is not visited
                visited[i] = true;
                temp.add(nums[i]);
                permutation(nums, ans, temp, visited);  // recursive call
                visited[i] = false;  // backtrack
                temp.remove(temp.size() - 1);  // remove last element
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];  // boolean array for visited
        permutation(nums, ans, temp, visited);
        return ans;
    }
}