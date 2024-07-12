class Solution {
    public int differenceOfSum(int[] nums) {
         int elementSum = 0;
        // Calculate the sum of digits of all numbers in the array
        int digitSum = 0;
        
        for (int num : nums) {
            elementSum += num;
            digitSum += sumOfDigits(num);
        }

        // Calculate the absolute difference between the element sum and the digit sum
        return Math.abs(elementSum - digitSum);
    }

    // Helper method to calculate the sum of digits of a given number
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

   