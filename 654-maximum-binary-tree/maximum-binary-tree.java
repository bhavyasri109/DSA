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

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int cc = 0;
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                cc = i;
            }
        }
        TreeNode root = new TreeNode(nums[cc]);
        root.left = build(nums, start, cc - 1);

        root.right = build(nums, cc + 1, end);

        return root;
    }

}