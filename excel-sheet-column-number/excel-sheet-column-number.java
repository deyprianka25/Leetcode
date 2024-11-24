class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char currentChar = columnTitle.charAt(i);
            int value = currentChar - 'A' + 1; 
            columnNumber = columnNumber * 26 + value;
        }
        return columnNumber;
    }
}