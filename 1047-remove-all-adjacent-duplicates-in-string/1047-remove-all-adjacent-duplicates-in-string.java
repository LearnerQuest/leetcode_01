class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch :st){
            ans.append(ch);
        }
        return ans.toString();
    }
}