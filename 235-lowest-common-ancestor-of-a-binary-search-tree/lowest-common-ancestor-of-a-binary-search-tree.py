# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if not root or p.val==root.val or q.val==root:
             return root
        cur = root
        while cur:
            if p.val<cur.val and q.val<cur.val:
                cur=cur.left
            elif p.val>cur.val and q.val>cur.val:
                cur=cur.right
            else:
                return cur