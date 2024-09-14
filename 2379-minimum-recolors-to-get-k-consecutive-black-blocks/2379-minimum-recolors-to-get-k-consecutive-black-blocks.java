class Solution {
    
    public int minimumRecolors(String blocks, int k) {
            return findMinOperations(blocks, k, 0, Integer.MAX_VALUE);
    }
    private int findMinOperations(String blocks, int k, int start, int minOps) {
        if (start + k > blocks.length()) {
            return minOps;
        }
        int currentOps = 0;
        for (int i = start; i < start + k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentOps++;
            }
        }
        minOps = Math.min(minOps, currentOps);
        return findMinOperations(blocks, k, start + 1, minOps);
    }
}