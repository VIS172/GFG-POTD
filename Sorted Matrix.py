class Solution:
    def sortedMatrix(self,N,Mat):
        k,ans=0,[]
        for i in Mat: ans.extend(i)
        ans.sort()
        for i in range(N):
            for j in range(N):
                Mat[i][j]=ans[k]
                k+=1
        return Mat