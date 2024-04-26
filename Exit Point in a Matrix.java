class Solution {
    public int[] FindExitPoint(int n, int m, int[][] mat) {
        
        
        int dir=1;      //1=east, 2=south, 3=west, 4=north
        int res[]=new int[2];
        int r=0; int c=0;
        while(true){
            
            if(mat[r][c]==0){
                if(dir==1){
                    if(c==m-1){
                        res[0]=r;
                        res[1]=c;
                        return res;
                    }
                    c++; 
                }
                else if(dir==2){
                    if(r==n-1){
                        res[0]=r;
                        res[1]=c;
                        return res;
                    }
                    r++;
                }
                else if(dir==3){
                    if(c==0){
                        res[0]=r;
                        res[1]=c;
                        return res;
                    }
                    c--;
                }
                else if(dir==4){
                    if(r==0){
                        res[0]=r;
                        res[1]=c;
                        return res;
                    }
                    r--;
                }
            }
            else{
                dir++;
                if(dir==5) dir=1;
                mat[r][c]=0;
            }
        }
        
    }
}