class Solution {
    public boolean wordPattern(String a, String b) {
          if(a==null || b==null){
            return false;
        }
        String[] arr = b.split(" ");
        int len = a.length();
        if(len != arr.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<Character, String>();
        char aa;
        String bb = new String();
        for(int i=0;i<len;++i){
            aa = a.charAt(i);
            bb = arr[i];
            if(map.get(aa)==null){
                if(map.containsValue(bb)){
                    return false;
                }
                map.put(aa,bb);
            }
            else if(!map.get(aa).equals(bb)){
                return false;
            }   
        }
        return true; 
        
    }
}