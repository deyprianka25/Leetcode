class Solution {
    public List<Integer> findDuplicates(int[] nums) {  
        //HASHSET
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }
}

//HASHMAP
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
      
        
        
        //OTHERS
         //List<Integer> duplicates = new ArrayList<>();
        
        //Arrays.sort(nums); 
        
        //for (int i = 0; i < nums.length - 1; i++) {
            //if (nums[i] == nums[i + 1]) {
                //duplicates.add(nums[i]); 
                //i++;
            //}
       // }
        
       // return duplicates; 
   // }
//}