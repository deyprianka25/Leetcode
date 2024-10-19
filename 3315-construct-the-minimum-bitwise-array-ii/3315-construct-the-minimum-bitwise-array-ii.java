class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
         int[] ans = new int[nums.size()];
        for (int i = 0; i < nums.size(); ++i) {
            ans[i] = getVal(nums.get(i));
        }
        return ans;
    }
    private int getVal(int x) {
        if (x == 2) {
            return -1;
        } 
        int lowestOneBit = Integer.lowestOneBit(x + 1);
        x -= lowestOneBit >> 1;
        return x;
    }
        
    }
