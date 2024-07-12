class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
    
    
    
    
    
        //int n = candies.length;
        //int sum = 0;
        //for(int i =0;i<n;i++){
            //sum +=extraCandies;
       // }
        //if(sum>=n){
           
        //return true;
        //}else{
            //return false;
        //}
        
   /// }
//}