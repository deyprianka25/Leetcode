class Solution {
    public int minLength(String s) {
            Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && ((stack.peek() == 'A' && c == 'B') || (stack.peek() == 'C' && c == 'D'))) {
                stack.pop(); // Remove the matching pair
            } else {
                stack.push(c); // Add the current character to the stack
            }
        }
        
        // The remaining stack size is the minimum possible length of the string
        return stack.size();
    }
}