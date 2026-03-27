class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char digit : num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        
        
        while (k > 0 ) {
            st.pop();
            k--;
        }
        for (char digit : st) {
            if (ans.length() == 0 && digit == '0') continue;
            ans.append(digit);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}