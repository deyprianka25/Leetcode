class Solution {
    public long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long lcm(long a ,long b){
        return (a*b)/gcd(a,b);
    }
    public long maxScore(int[] nums) {
        long arraygcd = 0;
        long arraylcm = 1;
        for(int num:nums){
            arraygcd=gcd(arraygcd,num);
            arraylcm = lcm(arraylcm,num);
        }
         long maxFactor = arraygcd * arraylcm;

        for (int i = 0; i < nums.length; i++) {
            long subGCD = 0;
            long subLCM = 1;

            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    subGCD = gcd(subGCD, nums[j]);
                    subLCM = lcm(subLCM, nums[j]);
                }
            }

            maxFactor = Math.max(maxFactor, subGCD * subLCM);
        }

        return maxFactor;
    }
}