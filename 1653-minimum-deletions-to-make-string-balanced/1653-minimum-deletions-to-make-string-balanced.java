class Solution {
    public int minimumDeletions(String s) {
            int n = s.length();
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == 'b') st.add('b');
            else {
                if(st.size() != 0) {
                    st.pop();
                    count++;
                }
            }
        }
        return count;
        
    }
}