class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
         for(int j=1;j<m;j++){
            for(int i=0;i<n;i++){
                int sum=0;
                if(i-1 >=0 && j-1>=0) sum=Math.max(M[i-1][j-1],sum);
                if(i+1 <n && j-1>=0) sum=Math.max(sum,M[i+1][j-1]);
                if(j-1>=0)  sum=Math.max(sum,M[i][j-1]);
                M[i][j]+=sum;
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,M[i][m-1]);
            
        }
        return ans;
    }
    
}