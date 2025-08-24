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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        StageOderList(root,result,0);
        return result;
    }
    private void StageOderList(TreeNode node, List<List<Integer>> result, int currOrder){
        if(node == null){
            return;
        }
        if (result.size() <= currOrder) {
            result.add(new ArrayList<>());
        }
        result.get(currOrder).add(node.val);
        StageOderList(node.left,result,currOrder+1);
        StageOderList(node.right,result,currOrder+1);
    }
}