class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String>ans = new ArrayList<>();
        partitions(s,0,ans,result);
        return result;
    }
    public static boolean isPallindrome(String s , int start , int end,List<String> ans){
        int i = start;
        int j = end;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        
        ans.add(s.substring(start, end+1));
        return true;
    }
    public static void partitions(String s,int start,List<String> ans,List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<String>(ans));
            return;
        }
        for(int idx = start;idx<s.length();idx++){
            //partition
            //pallindrome
            //ans add
            //next section call
            //return ans remove.
            if(isPallindrome(s,start,idx,ans)){
                partitions(s, idx + 1, ans, result);
                ans.remove(ans.size()-1);
            }
        }
    }
}