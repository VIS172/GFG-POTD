class Pair{
    int key;
    int val;
    Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) q.add(new Pair(i,j));
                if(grid[i][j]==1) cnt++;
            }
        }
        int nrow[] = {-1,0,1,0};
        int ncol[] = {0,-1,0,1};
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean change = false;
            while(size-- > 0){
                Pair u = q.poll();
                for(int k=0;k<4;k++){
                    int row = u.key+nrow[k];
                    int col = u.val+ncol[k];
                    if(row<n && row>=0 && col<m && col>=0 && grid[row][col]==1){
                        grid[row][col] = 2;
                        q.add(new Pair(row,col));
                        cnt--;
                        change = true;
                    }
                }   
            }
            if(change) ans++;
        }
        return cnt==0?ans:-1;
    }
}