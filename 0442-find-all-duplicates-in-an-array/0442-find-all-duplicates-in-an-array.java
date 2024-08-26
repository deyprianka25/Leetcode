class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //List<Integer> res = new ArrayList<>();
        //Map<Integer,Integer> map = new HashMap<>();
        //for(int i=0;i<nums.length;i++){
            //if(map.getOrDefault(nums[i],0)==0){
               // map.put(nums[i],1);
            //}else{
                //res.add(nums[i]);
            //}
       // }
       // return res;
        
   // }
//}
        
        
        
         List<Integer> duplicates = new ArrayList<>();
        
        Arrays.sort(nums); 
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicates.add(nums[i]); 
                i++;
            }
        }
        
        return duplicates; 
    }
}