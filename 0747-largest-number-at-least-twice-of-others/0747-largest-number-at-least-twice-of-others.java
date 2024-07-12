class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                index = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        // Check if the largest element is at least twice as large as the second largest element
        if (largest >= 2 * secondLargest) {
            return index;
        }
        
        return -1;
    }
}
        
        
        
        
        
        //largest=Integer.MIN_VALUE;
        //secondlargest = Integer.MIN_VALUE;
        //for(int i=0;i<nums.length;i++){
            //largest =Math.max(largest,nums[i]);
            
        //}
        //if(secondlargest<largest){
            //secondlargest = Math.max(secondlargest,nums[i]);
        //}
        //if(secondlargest = 2* largest){
            //return indexOf(largest);
        //}
        
    //}
    //return -1;
//}
