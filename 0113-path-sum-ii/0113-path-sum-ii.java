/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null) return ans;
        display(root, ans, res, targetSum ,0);
        return ans;

    }
    public void display(TreeNode root , List<List<Integer>> ans, List<Integer> res,int ts, int cs){
        res.add(root.val);
        cs+= root.val;
        if(root.left == null && root.right == null){
            if(cs == ts){
                ans.add(new ArrayList<>(res));
            }
        }
        if(root.left != null){
            display(root.left, ans, res, ts, cs);

        }
        if(root.right!= null){
            display(root.right, ans, res, ts, cs);
        }
       res.remove(res.size()-1);//backtraking step

    }
    
    
}