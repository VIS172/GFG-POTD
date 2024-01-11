import math
class Solution:
    # Return the size of the largest sub-tree which is also a BST
    def BST_largest(self,root,min_max_dict):
        if(root==None):
            return {'min':math.inf,'max':-math.inf,'size':0}
        
        #post order traversal
        left=self.BST_largest(root.left,min_max_dict)
        right=self.BST_largest(root.right,min_max_dict)
        
        if(left['max']<root.data and root.data<right['min']):#valid conditions of a BST node [largest from left < node < smallest from right]
            return {'min':min(root.data,left['min']),'max':max(root.data,right['max']),'size':left['size']+right['size']+1} #if current node is part of BST,return smallest from left and largest from right for parent nodes
    
        #return min_max_dict such that node dont lie in the range
        return {'min':-math.inf,'max':math.inf,'size':max(left['size'],right['size'])}
        
    def largestBst(self, root):
        #code here
        min_max_dict={'min':-math.inf,'max':math.inf,'size':0}
        res=self.BST_largest(root,min_max_dict)
        return res['size']