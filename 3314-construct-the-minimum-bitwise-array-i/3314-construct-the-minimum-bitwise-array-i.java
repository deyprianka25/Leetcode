class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
       int n = nums.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int candidate = 0; candidate < nums.get(i); candidate++) {
                if ((candidate | (candidate + 1)) == nums.get(i)) {
                    ans[i] = candidate;
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans[i] = -1;
            }
        }
        
        return ans;
    }
}
