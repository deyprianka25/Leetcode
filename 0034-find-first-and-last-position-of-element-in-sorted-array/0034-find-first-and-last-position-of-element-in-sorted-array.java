class Solution {
    public int[] searchRange(int[] nums, int target) {
       // int arr = new int[2];
        //arr[0]=arr[1] = -1;
        //for(int i = 0; i<nums.length;i++){
            //if(nums[i] == target){
                //arr[0] = i;
                //while(i<nums.length && nums[i+1]==target){
                    //i++;
                    //arr[1] = i;
                    //break;
                //}
            //}
        //}
        //return arr;
        
        final int l = firstGreaterEqual(nums, target);
    if (l == nums.length || nums[l] != target)
      return new int[] {-1, -1};
    final int r = firstGreaterEqual(nums, target + 1) - 1;
    return new int[] {l, r};
  }

  private int firstGreaterEqual(int[] A, int target) {
    int l = 0;
    int r = A.length;
    while (l < r) {
      final int m = (l + r) / 2;
      if (A[m] >= target)
        r = m;
      else
        l = m + 1;
    }
    return l;
  }
}