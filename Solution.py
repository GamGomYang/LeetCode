# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        result = []
        right_path = []
        left_path = []

        def dfs_right(node):
            if node is None:
                return
            
            right_path.append(node.val)
            dfs_right(node.right , right_path)
            dfs_right(node.left,right_path)


        def dfs_left(node):
            if node is None:
                return
            
            left_path.append(node.val)
            dfs_left(node.right, left_path)
            dfs_left(node.left,left_path)


        dfs_left(root, left_path)
        dfs_right(root, right_path)

        return [left_path , right_path]