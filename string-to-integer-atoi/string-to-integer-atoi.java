class Solution {
    public int myAtoi(String s) {
          boolean neg=false;
        int i=0;
        int n = s.length();
        if(n==0){
            return 0;
        }
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && s.charAt(i)=='-'){
            i++;
            neg=true;
        }
        else if(i<n && s.charAt(i)=='+'){
            i++;
        }
        while(i<n && s.charAt(i)=='0'){
            i++;
        }
        int j=i;
        for(;i<n;i++){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
        }
        if(i==j){
            return 0;
        }
        if(i-j>10){
            if(neg){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        if(i-j==10){
            if(neg){
                String str = "2147483648";
                int k=0;
                while(k<10){
                    if(str.charAt(k)==s.charAt(j+k)){
                        k++;
                        if(k==10){
                            return Integer.MIN_VALUE;
                        }
                        continue;
                    }
                    else if (s.charAt(j+k)>str.charAt(k)){
                        return Integer.MIN_VALUE;
                    }
                    else{
                        break;
                    }
                }
            }
            else{
                String str = "2147483647";
                int k=0;
                while(k<10){
                    if(str.charAt(k)==s.charAt(j+k)){
                        k++;
                        if(k==10){
                            return Integer.MAX_VALUE;
                        }
                        continue;
                    }
                    else if (s.charAt(j+k)>str.charAt(k)){
                        return Integer.MAX_VALUE;
                    }
                    else{
                        break;
                    }
                }
            }
        }   
        String str = s.substring(j,i); 
        int res = Integer.parseInt(str);
        if(neg){
            res = -res;
        }    
        return res;
    }
}