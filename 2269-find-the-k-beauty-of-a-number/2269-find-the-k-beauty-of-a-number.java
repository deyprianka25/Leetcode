class Solution {
    public static int beauty (String numStr,int num,int k){
        if(numStr.length()<k){
            return 0;
        }
        String substring = numStr.substring(0,k);
        int subnum = Integer.parseInt(substring);
        int count =0;
        if(subnum != 0 && num%subnum==0){
            count = 1;
        }
        return count + beauty(numStr.substring(1),num,k);
    }
    public int divisorSubstrings(int num, int k) {
        String numStr = Integer.toString(num);
        return beauty(numStr,num,k);
        
    }
}