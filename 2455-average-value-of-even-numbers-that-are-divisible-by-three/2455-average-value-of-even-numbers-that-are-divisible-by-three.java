class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        
        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        if (count > 0) {
            return (int) sum / count; 
        } else {
            return 0;
        }
    }
}
