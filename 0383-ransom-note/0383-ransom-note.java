class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        int m = magazine.length();
        for(int i = 0; i<m; i++){
            char c = magazine.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        int  r = ransomNote.length();
        for(int i = 0; i<r;i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c) && map.get(c)>0){
                map.put(c,map.get(c)-1);
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}