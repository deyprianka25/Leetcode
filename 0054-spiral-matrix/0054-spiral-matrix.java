class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        // Initialize boundaries for rows and columns
        int srow = 0;                 // Start row
        int scol = 0;                 // Start column
        int erow = matrix.length - 1;  // End row
        int ecol = matrix[0].length - 1; // End column
        
        int total = matrix.length * matrix[0].length;
        int count = 0;
        
        // Traverse the matrix in spiral order
        while (count < total) {
            // Print first row (left to right)
            for (int i = scol; count < total && i <= ecol; i++) {
                ans.add(matrix[srow][i]);
                count++;
            }
            srow++;
            
            // Print last column (top to bottom)
            for (int i = srow; count < total && i <= erow; i++) {
                ans.add(matrix[i][ecol]);
                count++;
            }
            ecol--;
            
            // Print last row (right to left)
            for (int i = ecol; count < total && i >= scol; i--) {
                ans.add(matrix[erow][i]);
                count++;
            }
            erow--;
            
            // Print first column (bottom to top)
            for (int i = erow; count < total && i >= srow; i--) {
                ans.add(matrix[i][scol]);
                count++;
            }
            scol++;
        }
        
        return ans;
    }
}
