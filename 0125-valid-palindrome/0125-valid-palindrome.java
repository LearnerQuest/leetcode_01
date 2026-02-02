class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        if(s.length()<1) return true;
        int i=0;
        return helper(s,i);
    }
    static boolean helper(String s, int i){
        if( i >= s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        return helper(s,i+1);
    }
}