class Solution {
    public boolean validMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            if(arr[s+1]>arr[s]){
                s++;
            }else if(arr[e-1]>arr[e]){
                e--;
            }else{
                break;
            }
        }
        return s!=0 && e!=arr.length-1 && s==e;
        
    }
}