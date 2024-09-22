class Solution {
    public int minStartValue(int[] nums) {
        int min =0;
        int prefixsum =0;
        for(int num:nums){
            prefixsum += num;
            min = Math.min(min,prefixsum);
        }
        if(min<0){
            return Math.abs(min)+1;
        }
        else{
            return 1;
        }
        
    }
}