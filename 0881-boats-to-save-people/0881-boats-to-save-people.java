class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        int boats = 0;
        while(left <= right){
            if(people[right]+people[left] <= limit){
                left++;
                right--;
                boats++;
            }
            else{
                right--;
                boats++;
            }
        }
        return boats;
        
    }
}