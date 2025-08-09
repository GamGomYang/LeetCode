
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
    public TreeNode invertTree(TreeNode root) {

        return invert(root);
    }

    public TreeNode invert(TreeNode node){

        if(node == null){
            return null;
        }


        TreeNode temp = null;


        temp = node.left;
        node.left = node.right;
        node.right = temp;


   
    node.left = invert(node.left);
    node.right = invert(node.right);
    
    return node;
    }

}