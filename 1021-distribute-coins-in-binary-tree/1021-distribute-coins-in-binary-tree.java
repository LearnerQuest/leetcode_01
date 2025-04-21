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
    int count =0;
    public int distributeCoins(TreeNode root) {
        //lc+rc+root-1;
        minc(root);
        return count;
    }
    public int minc(TreeNode root){
        if(root == null){
            return 0;
        }
        int lc = minc(root.left);
        int rc = minc(root.right);
        count+= Math.abs(lc)+Math.abs(rc);
        return lc+rc+root.val-1;
    }
     
}