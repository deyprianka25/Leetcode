class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row : nums) {
            Arrays.sort(row);
            reverse(row);
        }
        
        int score = 0;
        int n = nums.length, m = nums[0].length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxHeap.add(nums[j][i]);
            }
            score += maxHeap.poll();
            maxHeap.clear();
        }
        
        return score;
    }
    private void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}