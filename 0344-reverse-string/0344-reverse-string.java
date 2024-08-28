class Solution {
    public void reverseString(char[] s) {
        
        //int i = 0;
       // int j = s.length-1;
        
        //while(i < j)
        //{
           //char temp =  s[i];
           //s[i] = s[j];
           // s[j] = temp;
           // i++; j--;
        //}
        
       // return;
   // }
//}

        
//USING STACK
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length;i++){
            st.push(s[i]);
        }
        int i=0;
        while(!st.empty()){
            s[i]= st.pop();
            i++;
        }
    }
}