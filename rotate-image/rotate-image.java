class Solution {
    public void rotate(int[][] matrix) {
        Swaprows(matrix);
        Transpose(matrix);
    }
    public static void Swaprows(int[][] matrix){
        int n = matrix.length;
        int start =0;
        int end = n-1;
        while(start<end){
            int []temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
    }
    public static void Transpose(int[][]matrix){
        int n = matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
    