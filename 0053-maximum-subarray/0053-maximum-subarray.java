class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
         //int sum = nums[0];
       // int maxi = nums[0];
       // for (int i = 1; i < nums.length; i++) {
       //     if (sum >= 0) {
               // sum += nums[i];
           // } else {
              //  sum = nums[i];
            //}
            //if (sum > maxi) {
               // maxi = sum;
            //}
       // }
        //return maxi;
    //}
//}