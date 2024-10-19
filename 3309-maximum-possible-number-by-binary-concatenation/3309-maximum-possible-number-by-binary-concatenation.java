class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] arr = new String[3];
        arr[0] = Integer.toBinaryString(nums[0]);
        arr[1] = Integer.toBinaryString(nums[1]);
        arr[2] = Integer.toBinaryString(nums[2]);
        String str = arr[0]+arr[1]+arr[2];
        int res = 0;
        res = help(str,res);
        str = arr[0]+arr[2]+arr[1];
        res = help(str,res);
        str = arr[1]+arr[0]+arr[2];
        res = help(str,res);
        str = arr[1]+arr[2]+arr[0];
        res = help(str,res);
        str = arr[2]+arr[0]+arr[1];
        res = help(str,res);
        str = arr[2]+arr[1]+arr[0];
        res = help(str,res);
        return res;
    }
    public static int help(String str,int res){
        int a = Integer.parseInt(str,2);
        if(res<a){
            return a;
        }
        return res;
    }
}