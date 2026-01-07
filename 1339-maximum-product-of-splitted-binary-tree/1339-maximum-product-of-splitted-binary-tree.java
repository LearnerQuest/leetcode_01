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
    static final int  Mod = 1_000_000_007;
    long totalSum =0;
    long maxProduct =0;
    long getTotalSum(TreeNode root){
        if(root == null) return 0;
        return root.val+getTotalSum(root.left)+getTotalSum(root.right);
    }
    long dfs(TreeNode root){
        if(root == null) return 0;
        long left = dfs(root.left);
        long right = dfs(root.right);
        long subSum = root.val+left+right;
        long product = subSum*(totalSum-subSum);
        maxProduct = Math.max(maxProduct, product);
        return subSum;
        
    }
    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        dfs(root);
        return (int)(maxProduct% Mod);
    }
}