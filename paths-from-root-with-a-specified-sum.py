class Solution:
    def rec(self,root,ans,a,sum,curr):
        if root==None: return
        curr+=root.data
        a.append(root.data)
        if curr==sum: ans.append(list(a))
        self.rec(root.left,ans,a,sum,curr)
        self.rec(root.right,ans,a,sum,curr)
        curr-=root.data
        a.pop()
    def printPaths(self, root, sum):
        #code here
        ans=[]
        self.rec(root,ans,[],sum,0)
        return ans
