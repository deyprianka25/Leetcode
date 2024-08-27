class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer ,Integer> m = new HashMap<>();
        m.put(0,1);
        int prefixsum = 0;
        int total =0;
        for(int i=0;i<nums.length;i++){
            prefixsum += nums[i];
            if(m.containsKey(prefixsum-k)){
                total += m.getOrDefault(prefixsum - k, 0);
                m.put(prefixsum, m.getOrDefault(prefixsum, 0) + 1);
            }
            else{
                m.put(prefixsum, m.getOrDefault(prefixsum, 0) + 1);
            }
        }
        return total;
        
    }
}