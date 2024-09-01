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
      Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        
        if (root == null) return ans;
        
        q.offer(root);
        
        while (!q.isEmpty()) {  
            int size = q.size();
            List<Integer> data = new LinkedList<>();
            
            while (size > 0) {
                TreeNode temp = q.poll();  
                data.add(temp.val);
                
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                
                if (temp.right != null) {
                    q.offer(temp.right);  
                }
                
                size--;
            }
            
            ans.add(data);
        }
        
        return ans;
    }
}