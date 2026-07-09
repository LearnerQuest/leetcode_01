class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // edge case
        if(m == 0)
            return 0;

        for(int i = 0; i <= n - m; i++) {
            int j;
            for( j = 0; j < m; j++) {
                 if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            // complete needle found
            if(j == m) {
                return i;
            }
        }

        return -1;
    }
}