class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        helper(0, 0, 0, "", num, target, ans);
        return ans;
    }
    public void helper(int index, long curVal, long prevVal, String expr, String num, 
    int target, List<String> ans) {
        if (index == num.length()) {
            if (curVal == target) {
                ans.add(expr);
            }
            return;
        }
        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break;

            String part = num.substring(index, i + 1);
            long val = Long.parseLong(part);

            if (index == 0) {
                helper(i + 1, val, val, part, num, target, ans);
            } else {
                helper(i + 1, curVal + val, val, expr + "+" + part, num, target, ans);
                helper(i + 1, curVal - val, -val, expr + "-" + part, num, target, ans);
                helper(i + 1, curVal - prevVal + prevVal * val, prevVal * val, expr + "*" + part,
                 num, target, ans);
            }
        }
    }
}