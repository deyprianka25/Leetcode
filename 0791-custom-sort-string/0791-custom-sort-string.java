class Solution {
    public String customSortString(String order, String str) {
                int[] frequency = new int[26];
        for (int i = 0; i < str.length(); ++i) {
            frequency[str.charAt(i) - 'a']++;
        }
        StringBuilder sortedStringBuilder = new StringBuilder();
        for (int i = 0; i < order.length(); ++i) {
            char currentChar = order.charAt(i);
            while (frequency[currentChar - 'a'] > 0) {
                sortedStringBuilder.append(currentChar);
                frequency[currentChar - 'a']--;
            }
        }
        for (int i = 0; i < 26; ++i) {
            while (frequency[i] > 0) {
                sortedStringBuilder.append((char) ('a' + i));
                frequency[i]--;
            }
        }
        return sortedStringBuilder.toString();
    }
}

        
    
