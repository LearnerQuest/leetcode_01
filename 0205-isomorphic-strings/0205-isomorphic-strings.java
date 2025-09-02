class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sarr = new int[256];
        int[] tarr = new int[256];
        for(int i=0; i<s.length(); i++){
            if(sarr[s.charAt(i)] != tarr[t.charAt(i)]){
                //we equate characters by their last-seen positions.
                return false;
            }
            sarr[s.charAt(i)] = i+1;
            tarr[t.charAt(i)] = i+1;
        }
        return true;
    }
}