class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        helper(num,target,res,0,"",0,0);
        return res;
    }

    private static void helper(String num,long target,List<String> res,int ind,String s,long curr,long prev){
        if(ind == num.length()){
            if(curr == target)
                res.add(s);
            return;
        }

        for(int i=ind;i<num.length();i++){
            if(i > ind && num.charAt(ind) == '0')
                break;
            long n = Long.parseLong(num.substring(ind,i+1));
            if(ind==0){
                helper(num,target,res,i+1,s+n,n,n);
            }
            else{
                helper(num,target,res,i+1,s+"*"+n,curr-prev+(prev*n),prev*n);
                helper(num,target,res,i+1,s+"+"+n,curr+n,n);
                helper(num,target,res,i+1,s+"-"+n,curr-n,-n);
            }
        }
    }
}