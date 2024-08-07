class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //SET APPROACH
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num: nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
            
        }
         int[] result = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            result[i++] = num;
        }

        return result;
    }
}

        
        
        
        //BRUTEFORCR APPROACH
      // ArrayList<Integer> result = new ArrayList<>();
        //for(int i=0;i<nums1.length;i++){
            //for(int j=0;j<nums2.length;j++){
                //if(nums1[i]==nums2[j]){
                    //if(!result.contains(nums1[i])){
                        //result.add(nums1[i]);
                    //}
                    //break;
                //}
            //}
       // }
       // int[] intersection = new int[result.size()];
       // for(int i=0;i<result.size();i++){
            //intersection[i]=result.get(i);
        //}
       // return intersection;
   // }
//}
        