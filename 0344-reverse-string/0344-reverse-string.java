class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        for(int c =0; c<s.length; c++){
            st.push(s[c]);
            
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = st.pop();
        }
    }
}
