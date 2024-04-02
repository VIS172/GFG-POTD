class Solution
{
    int ans = 1000000000 ;
    int prev = -1 ;
    
    void solve( Node root )
    {
        if(root == null ) return ;
        
        solve( root.left ) ;
        if( prev != -1 ) ans = Math.min( ans , Math.abs(prev - root.data ) ) ;
        prev = root.data ;
        solve(root.right) ;
    }
    int absolute_diff(Node root)
    {
        //Your code here
        
        solve(root) ;
        return ans ;
    }
}