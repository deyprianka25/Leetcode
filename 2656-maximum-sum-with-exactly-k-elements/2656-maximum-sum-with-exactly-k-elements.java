class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int num:nums){
            max = Math.max(max,num);
       
        }
         int result = 0;
        while(--k>=0){
            result+=(max+k);
        
        }
        return result;
        
    }
}