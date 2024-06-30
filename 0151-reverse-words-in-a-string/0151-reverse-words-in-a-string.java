class Solution {
    public String reverseWords(String s) {
         s = s.trim();
        String[] words = s.split("\\s+");
        Stack<String> stack = new  Stack<>();
        for (String word : words) {
            stack.push(word);
        }
         StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
            if (!stack.isEmpty()) {
                reversedStr.append(" ");
            }
        }
        
        return reversedStr.toString();
    }
        
    }
