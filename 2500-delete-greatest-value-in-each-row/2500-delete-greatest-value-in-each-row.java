class Solution {
    public int deleteGreatestValue(int[][] grid) {
        //APPROACH:SIMPLE
        int m = grid.length;
        int n = grid[0].length;
        int answer = 0;
        for(int i =0;i<m;i++){
            Arrays.sort(grid[i]);
        }
        for(int col= n-1;col>=0;col--){
            int maxval =0;
            for (int row = 0; row < m; row++) {
                maxval = Math.max(maxval, grid[row][col]);
        }
            answer+=maxval;    
    }
        return answer;
}
}