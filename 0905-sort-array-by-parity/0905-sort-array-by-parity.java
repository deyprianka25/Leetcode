class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s =0;
        int e = 0;
        while(e<nums.length){
            if(nums[e]%2==0){
                swap(nums,s,e);
                s++;e++;
            }
            else{
                e++;
            }
        }
        return nums;
        
    }
    private static void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}
