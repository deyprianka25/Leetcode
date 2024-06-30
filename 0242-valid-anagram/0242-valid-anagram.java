class Solution {
       public HashMap createHM(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==null){
                hm.put(s.charAt(i),1);
            }
            else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        return hm;
    }
     public boolean isAnagram(String s, String t) {
        if(s.length()==0 && t.length()==0){
            return true;
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        hm1=createHM(s);
        hm2=createHM(t);
        if(hm1.equals(hm2)){
            return true;
        }
        else{
            return false;
        }
    }
}
