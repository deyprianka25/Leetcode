class Solution { 
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> st1 = backspaceOperationwithStack(S);
        Stack<Character> st2 =   backspaceOperationwithStack(T);
        return st1.equals(st2);
    }
    public static Stack<Character>  backspaceOperationwithStack(String str){
Stack<Character> st = new Stack<>();
for(int i = 0;i<str.length();i++){
    char ch = str.charAt(i);
    if(ch !='#'){
        st.push(ch);
    }
    else if(!st.isEmpty()){
        st.pop();
    }

}
        return st;
        

}
}