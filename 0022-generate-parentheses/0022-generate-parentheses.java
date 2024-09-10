class Solution {
     public static void parentheses(int n, int left, int right, List<String> ans, String temp) {
        if (left + right == 2 * n) {
            ans.add(temp); // Add the valid combination to the result
            return;
        }
        
        // If we can still add a left parenthesis
        if (left < n) {
            parentheses(n, left + 1, right, ans, temp + '('); // Concatenate '(' and recurse
        }
        
        // If we can add a right parenthesis (only if we have more left ones to match)
        if (right < left) {
            parentheses(n, left, right + 1, ans, temp + ')'); // Concatenate ')' and recurse
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        parentheses(n, 0, 0, ans, ""); // Start the recursive function
        return ans;
    }
}