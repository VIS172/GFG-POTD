class Solution{
    static long sequence(int n){
        // code here\
        long s=1;
        long sum=0;
        for(int i=1;i<=n;i++){
            long k=1;
            for(int j=1;j<=i;j++){
               k=(k*s)%(1000000007);
               s++;
            }
            sum=(sum+k)%(1000000007);
        }
        return sum;
    }
}