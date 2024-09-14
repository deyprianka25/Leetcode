class Solution {
    
    public int minimumRecolors(String blocks, int k) {
            return findMinOperations(blocks, k, 0, Integer.MAX_VALUE);
    }
    
    // Recursive helper function
    private int findMinOperations(String blocks, int k, int start, int minOps) {
        // Base case: if remaining part of string is shorter than k, stop recursion
        if (start + k > blocks.length()) {
            return minOps;
        }
        
        // Count the number of 'W's in the current window of length k
        int currentOps = 0;
        for (int i = start; i < start + k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentOps++;
            }
        }
        
        // Update the minimum number of operations
        minOps = Math.min(minOps, currentOps);
        
        // Recursive call: move the window to the right by 1 and check the next window
        return findMinOperations(blocks, k, start + 1, minOps);
    }
}