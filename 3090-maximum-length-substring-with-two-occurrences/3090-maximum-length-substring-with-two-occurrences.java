class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int maxlength = 0;
        int left = 0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
                         
            while(map.get(s.charAt(right))>2){
                int leftVal = map.get(s.charAt(left))-1;
                map.put(s.charAt(left),leftVal);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
        
    }
}