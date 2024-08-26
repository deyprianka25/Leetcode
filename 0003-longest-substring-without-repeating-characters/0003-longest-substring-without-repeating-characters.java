class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Set<Character> a = new HashSet<>();
        //int left = 0;
        //int right = 0;
        //int maxSublength = 0;
        //while(right<s.length()){
            //if(a.contains(s.charAt(right))){
               // a.remove(s.charAt(left));
                //left++;
            //}
            //else{
               // a.add(s.charAt(right));
               // maxSublength = Math.max(maxSublength,right-left+1);
                //right++;
            //}
       //// }
       // return maxSublength;
        
        
        
        //HashSet<Character> set = new HashSet<>();
        //String longestOverall = "";
        //String longestTillnow = "";
        //for(int i =0;i<s.length();i++){
            //char c = s.charAt(i);
            //if(set.contains(c)){
                //longestTillnow="";
                //set.clear();
            //}
            
            //set.add(c);
            //longestTillnow +=c;
            //if(longestTillnow.length()>longestOverall.length()){
                //longestOverall = longestTillnow;
            //}
        //}
        //return longestOverall;
        
  // }
//}
      boolean[] count = new boolean[256];
        int first = 0, second = 0, len = 0;
        
        while (second < s.length()) {
            while (count[s.charAt(second)]) {
                count[s.charAt(first)] = false;
                first++;
            }
            count[s.charAt(second)] = true;
            len = Math.max(len, second - first + 1);
            second++;
        }
        
        return len;
    }
}
