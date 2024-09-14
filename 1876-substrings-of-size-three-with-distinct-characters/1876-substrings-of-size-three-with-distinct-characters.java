class Solution {
    public int countGoodSubstrings(String s) {
        //RECURSIVE APPROACH
        if(s.length()<3){
            return 0;
        }
        if(isGood(s.substring(0,3))){
            return 1+countGoodSubstrings(s.substring(1));
        }
        else{
            return countGoodSubstrings(s.substring(1));
        }
                                         }
        private boolean isGood(String  substring){
            return substring.charAt(0) != substring.charAt(1)  &&
                    substring.charAt(1) != substring.charAt(2)  &&
                    substring.charAt(0) != substring.charAt(2);
        } 
}
                                         
       // SIMPLE APPROACH
        //int count =0;
        //for (int i = 0; i < s.length() - 2; i++) {
           // String substring = s.substring(i, i + 3);
            //if (isDistinct(substring)) {
             //   count += 1;
            //}
       // }
        
       // return count;
   // }
   // private boolean isDistinct(String substring) {
       // return substring.charAt(0) != substring.charAt(1) && 
              // substring.charAt(0) != substring.charAt(2) && 
              // substring.charAt(1) != substring.charAt(2);
   // }
    
        
        
   // }
