class Solution{
    
    public static int countBitsFlip(int a, int b){
        
        if(a==b){
            return 0;
        }
        int count = 0;
        int left = 1;
        while(a>0 || b>0){
            if((a&left)!=(b&left)){
                count++;
            }
            a >>= 1;
            b >>= 1 ;
        }
        return count;
    }
    
    
}