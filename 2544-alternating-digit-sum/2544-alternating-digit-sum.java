class Solution {
    public int alternateDigitSum(int n) {
         String numStr = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (i % 2 == 0) {
                sum += digit; 
            } else {
                sum -= digit;
            }
        }
        return sum;
    }
}
        
        
    