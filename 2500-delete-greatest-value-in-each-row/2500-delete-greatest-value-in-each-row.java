class Solution {
    public int deleteGreatestValue(int[][] grid) {
        //APPROACH:PRIORITY QUEUE
        int m = grid.length;
        int n = grid[0].length;
        int answer = 0;
        PriorityQueue<Integer>[] rowQueues = new PriorityQueue[m];
        for (int i = 0; i < m; i++) {
            rowQueues[i] = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < n; j++) {
                rowQueues[i].offer(grid[i][j]); 
            }
        }
        for (int col = 0; col < n; col++) {
            int maxVal = 0;
            for (int row = 0; row < m; row++) {
                int removedValue = rowQueues[row].poll();  
                maxVal = Math.max(maxVal, removedValue);   
            }
            answer += maxVal;
        }

        return answer;

        
        //APPROACH:SIMPLE
        //int m = grid.length;
        //int n = grid[0].length;
        //int answer = 0;
        //for(int i =0;i<m;i++){
            //Arrays.sort(grid[i]);
       // }
       // for(int col= n-1;col>=0;col--){
            //int maxval =0;
            //for (int row = 0; row < m; row++) {
                //maxval = Math.max(maxval, grid[row][col]);
       // }
           // answer+=maxval;    
    //}
        //return answer;
}
}