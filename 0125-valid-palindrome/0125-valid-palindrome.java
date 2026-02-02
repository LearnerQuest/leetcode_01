class Solution {
    public boolean isPalindrome(String s) {
        return helper(s,0, s.length()-1);
    }
    static boolean helper(String s, int lt, int rt ){
        if(lt>=rt) return true;
        char l = s.charAt(lt);
        char r = s.charAt(rt);
        if(!Character.isLetterOrDigit(l)) return helper(s, lt+1 , rt);
        if(!Character.isLetterOrDigit(r)) return helper(s, lt , rt-1);
        if(Character.toLowerCase(l) !=Character.toLowerCase(r) ) return false;
        return helper(s, lt+1, rt-1);
    }
}