import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '(':
                case '{':
                case '[':
                    st.push(c);
                    break;

                case ')':
                    if (st.isEmpty() || st.pop() != '(') return false;
                    break;

                case '}':
                    if (st.isEmpty() || st.pop() != '{') return false;
                    break;

                case ']':
                    if (st.isEmpty() || st.pop() != '[') return false;
                    break;
            }
        }
        return st.isEmpty();
    }
}
