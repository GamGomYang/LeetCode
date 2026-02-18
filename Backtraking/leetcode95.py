# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def generateTrees(self, n: int) -> List[Optional[TreeNode]]:
        
        if n == 0 :
            return []
        
        
        def tree(start , end):
            if start > end :
                return [None]
            
            result = []

            for val in range(start , end+1):
                left_tree = tree(start , val-1 )
                right_tree = tree(val+1 , end)

                for left in left_tree:
                    for right in right_tree:
                        root = TreeNode(val)
                        root.left = left
                        root.right = right
                        result.append(root)

            return result
        
        return tree(1,n)
