class MyComp implements Comparator<ArrayList<Integer>>
{
    public int compare(ArrayList<Integer> a,ArrayList<Integer> b)
    {
        for(int i=0;i<a.size();i++)
            if((a.get(i)-b.get(i)) != 0)return a.get(i)-b.get(i);
        
        return a.get(0)-b.get(0);
    }
}

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) 
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        if(n==1){
            ans.add(new ArrayList<>(Arrays.asList(1)));
            return ans;
        }
        
        if(n==2 || n==3)return ans;
        
        int board[][]=new int[n][n];    // 1 represent Queen in that block
        
        generate(board,0,ans);
        
        Collections.sort(ans,new MyComp());
        return ans;
    }
    
    static void generate(int board[][],int row,ArrayList<ArrayList<Integer>> ans){
        
        if(row==board.length){
            ans.add(createAns(board));
            return;
        }
        
        for(int i=0;i<board.length;i++)
        {
            if(isSafe(board,row,i)){
                board[row][i]=1;
                generate(board,row+1,ans);
                board[row][i]=0;
            }
        }
    }
    
    static boolean isSafe(int board[][],int row,int col)
    {
        // checking vertically up if Queen is present
        for(int i=row-1;i>=0;i--)
            if(board[i][col]==1)return false;
        
        // checking up-left diagonal if Queen is present
        for(int i=row-1,j=col-1 ; i>=0 && j>=0 ; i--,j--)
            if(board[i][j]==1)return false;
        
        // checking up-right diagonal if Queen is present
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length ; i--,j++)
            if(board[i][j]==1)return false;
        
        return true;
        
    }
    
    static ArrayList<Integer> createAns(int board[][])
    {
        int n=board.length;
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0;i<n;i++)
            res.add(0);    
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(board[i][j]==1)
                    res.set(j,i+1);
        
        return res;
    }
}