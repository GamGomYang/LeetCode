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
    public boolean isBalanced(TreeNode root) {
        return balanceChecker(root) != -1;
        
    }

    private int balanceChecker(TreeNode node){

        if( node == null ){

            return 0;
        }

        int leftNode = balanceChecker(node.left);
        int rightNode = balanceChecker(node.right);

        if(leftNode == -1){

            return -1;
        }
        if(rightNode == -1){

            return -1;
        }

        if(Math.abs(leftNode - rightNode)>1){
            return -1;
        }

        
        return Math.max(leftNode , rightNode )+1;
    }


}