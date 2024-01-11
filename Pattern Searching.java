class Solution {
    int search(String txt, String pat) {
         
         
         int res=-1;        
        
         int n=txt.length();
        int m=pat.length();
        
    
        
        for(int i=0;i<=n-m;i++){
            
            
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
                
            }
            if(j==m){
            res=i+1;
            
            break;
            }
            
        }
        
        if(res!=-1)
        return 1;
        return 0;
    }
};