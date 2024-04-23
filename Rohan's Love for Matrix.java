class Solution {
    static int firstElement(int n) {
        int a=1;
        int b=1;
        int mod=1000000007;
        
        if(n==0 || n==1) return 1;
        
        if(n==2)return 2;
        
        for(int i=2;i<n;i++){
                int temp=a;
                a=(a+b)%mod;
                b=temp;
        }
        return a;
       
    }
}