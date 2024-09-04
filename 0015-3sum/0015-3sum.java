class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                    ans.add(temp);
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        if (ans.isEmpty()) {
            return new ArrayList<>();
        }

        return ans;
    }
}

        
    
        //Set<List<Integer>> res = new HashSet<>();
        //if(nums.length==0)  return new ArrayList<>(res);
        //Arrays.sort(nums);
        //for(int i=0;i<nums.length-2;i++){
            //int j = i+1;
            //int k = nums.length-1;
            //while(j<k){
                //int sum = nums[j]+nums[k];
                //if(sum == -nums[i]){
                    //res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    //j++; k--;
                //}
                //else if (sum>-nums[i]) k--;
                ////else if (sum<-nums[i]) j++;
            //}
        //}
        //return new ArrayList<>(res);
        
    //}
//}