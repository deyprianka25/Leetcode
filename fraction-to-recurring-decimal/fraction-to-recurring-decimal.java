class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0"; 
        
        StringBuilder result = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }
        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);
        result.append(num / denom);
        long remainder = num % denom;

        if (remainder == 0) return result.toString(); 
        result.append(".");
        HashMap<Long, Integer> remainderMap = new HashMap<>();

        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                result.insert(remainderMap.get(remainder), "(");
                result.append(")");
                break;
            }
            remainderMap.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / denom); 
            remainder %= denom; 
        }

        return result.toString();
    }
}