class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse Right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
             for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse Left
            if (top <= bottom) { // check if top didn't cross bottom
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse Up
            if (left <= right) { // check if left didn't cross right
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                      }
                left++;
            }
        }

        return result;
        
    }
}