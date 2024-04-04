class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(var item:nums){
            var value = map.getOrDefault(item,0)+1;
            if (value>2) return false;
            map.put(item,value);
        }
        return true;
        
    }
}