class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int [] account: accounts){
            int sum =0;
            for(int amt: account){
                sum += amt;
            }
            if(maxwealth<sum){
                maxwealth=sum;
            }
        }
        return maxwealth;
        
    }
}