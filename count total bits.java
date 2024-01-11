class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
      if(n==0) return 0;
        int pow = 0, temp = n;
        while(temp>1){
            temp = temp >> 1;
            pow++;
        }
        return (int)Math.pow(2, pow-1)*pow + n-(int)Math.pow(2, pow) + 1 + countSetBits(n-(int)Math.pow(2, pow));  
    }
}