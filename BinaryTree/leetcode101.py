# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:

        if root is None :
            return False
        
        result = False

        def symetric(a,b):
            
            if a is None and b is None :
                return True
            
            if b is None or a is None:
                return False
            
            if b.val != a.val:
                return False

            return symetric(a.left , b.right ) and symetric(a.right , b.left)

        
        return symetric(root.right , root.left)

        
            
            
            


            