class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int a = 1, b = 1, c;
        int mod = 1000000007;
        
        for(int i=1;i<n;i++) {
            c = (a+b) % mod;
            a = b;
            b = c;
        }
        return b;
    }
}