class Solution {
     public static void parentheses(int n, int left, int right, List<String> ans, String temp) {
        if (left + right == 2 * n) {
            ans.add(temp); 
            return;
        }
        if (left < n) {
            parentheses(n, left + 1, right, ans, temp + '('); 
        }
        if (right < left) {
            parentheses(n, left, right + 1, ans, temp + ')'); 
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        parentheses(n, 0, 0, ans, ""); 
        return ans;
    }
}