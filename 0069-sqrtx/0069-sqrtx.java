class Solution {
    private static  int square(int x,int s, int e){
        if(s>e){
            return e;
        }
        int mid = s+(e-s)/2;
        if(mid==x/mid){
            return mid;
            
        }
        else if(mid<x/mid){
            return square(x,mid+1,e);
            
        }
        else{
            return square(x,s,mid-1);
        }
    }
    public int mySqrt(int x) {
       if (x == 0) return 0;
        return square(x,1,x);
    }
}