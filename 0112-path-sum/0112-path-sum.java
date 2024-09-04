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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        boolean left = false;
        boolean right = false;
        targetSum -= root.val;
        if(root.left==null && root.right==null && targetSum==0){
            return true;
        }
        else{
            if(root.left!=null){
                left = hasPathSum(root.left,targetSum); 
            }
            if(root.right!=null){
                right = hasPathSum(root.right,targetSum);
            }
        }
        return left||right;
        
        
    }
}