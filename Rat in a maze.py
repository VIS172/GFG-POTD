
def MazeSolver(i,j,n,m,st,res,visited):
    
    
    if i < 0 or j < 0 or i == n or j == n or m[i][j] == 0 or [i,j] in visited:
        return False
        
    if i == n-1 and j == n-1:
        res.append(st)
        return 
    
    visited.append([i,j])
    
    MazeSolver(i+1,j,n,m,st+"D",res,visited) # Checking Downward
    MazeSolver(i-1,j,n,m,st+"U",res,visited) # Checking upward
    MazeSolver(i,j+1,n,m,st+"R",res,visited) # Checking right side
    MazeSolver(i,j-1,n,m,st+"L",res,visited) # Checking left side
    
    visited.pop()
    
    if res: return res
    return [-1]

class Solution:
    def findPath(self, m, n):
        
        if m[0][0] == 0: return [-1]
        
        ans = MazeSolver(0,0,n,m,"",[],[])
        
        return ans