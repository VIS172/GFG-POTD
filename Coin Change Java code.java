class Solution {
    

    public long count(int coins[], int N, int sum) {
                    
     
        // code here.
        long dp [][] = new long[N+1][sum+1];

        for(int i = 1;i<=N;i++){
            dp[i][0] = 1;
        }
        
        long ans = 0;
        
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=sum;j++){
                   dp[i][j]= dp[i-1][j] ;
                   
                   if(j-coins[i-1]>=0){
                        dp[i][j] += dp[i][j-coins[i-1]];
                   }
                  
            }
        }

    return dp[N][sum];
        
        
    }
}