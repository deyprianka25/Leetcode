class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)  return false;
        int t=x;
        long reverse = 0;
        while(t!=0){
            reverse=reverse*10+ t%10;
            t=t/10;
        }
        if(reverse==x)  return true;
        else return false;
        
        }
    }
