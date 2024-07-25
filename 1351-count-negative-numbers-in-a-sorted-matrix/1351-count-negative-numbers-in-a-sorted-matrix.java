class Solution {
    public int countNegatives(int[][] grid) {
        int totalRow = grid.length;
        int totalCol = grid[0].length;
        int row =0,col=totalCol-1,count=0;
        while(row<totalRow && col>=0){
            if(grid[row][col]<0){
                col--;
                count += totalRow - row;
            }
            else{
                row++;
            }
        }
        return count;
        
    }
}