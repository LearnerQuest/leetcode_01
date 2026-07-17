class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int window =0;
        int max =Integer.MIN_VALUE;
        for(int right =0; right<s.length(); right++){
            if(isVowel(s.charAt(right))){
                window++;
            }
            if(right - left +1 == k){
                max = Math.max(max, window);
                if(isVowel(s.charAt(left))){
                    window--;
                }
                left++;
            }
            
        }
        return max;
    }
    private boolean isVowel(char ch){
        return ch == 'a'||
               ch == 'e'||
               ch == 'i'||
               ch == 'o'||
               ch == 'u';
    }
}