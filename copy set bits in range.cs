class Solution{
    static int setSetBit(int x, int y, int l, int r){
        
        
        int couple=0;
        for(int i=l-1; i<=r-1; i++){
            int mask= 1<<i;
            
            int result= y & mask;
            
            if(result!=0){
                couple= couple | mask;
            }
        }
        
        return x | couple;
    }
}