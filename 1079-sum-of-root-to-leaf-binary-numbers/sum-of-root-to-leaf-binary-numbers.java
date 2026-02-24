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
    public int sumRootToLeaf(TreeNode root) {
        return DFS(root,0);
    }
    public int DFS(TreeNode root,int num){
        if(root==null){
            return 0;
        }
        num=num*2+root.val;
        if(root.left==null&&root.right==null){
            return num;
        }
        return DFS(root.left,num)+DFS(root.right,num);
    }
}