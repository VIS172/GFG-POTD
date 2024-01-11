class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        return SodukoHelper(grid,0,0);
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
       for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
               System.out.print(grid[i][j]+" "); //PRINTING THE GRID
           }
          // System.out.println();
       }
    }
    static boolean SodukoHelper(int grid[][],int row,int col){
        if(row==9) return true; // BASE CASE-> IF ROW IS EQUAL TO 9 THAT MEANS THAT 0 TO 8 ROWS ARE FILLED SUCCESSFULLY ANF GRID IS COMPLETED
        int nextrow=row; //NEXT ROW
        int nextcol=col+1; //NEXT COL
        if(col+1==9){ 
            nextrow=row+1; //UPDATING ROW ONLY IF ALL COLUMNS ARE TRAVERSED 
            nextcol=0;
        }
        if(grid[row][col]!=0) return SodukoHelper(grid,nextrow,nextcol); //IF ANY DIGIT IS ALREADY THERE CHECK FOR NEXT ROW OR COLUMN
        for(int digit=1;digit<=9;digit++){
            if(isSafe(grid,row,col,digit)){  //CHECKING SAFE CONDITION FOR PRESENT ROW OR COLUMN FOR A PARTICULAR DIGIT
                grid[row][col]=digit;
                if(SodukoHelper(grid,nextrow,nextcol)){ //CALLING RECURSIVELY FOR NEXT ROW OR COLUMN
                    return true;
                }
                grid[row][col]=0;  //BACKTRACKING STEP--> AT SOME POINT THE DIGIT PLACED IT NOT CORRECT SO IT WILL AGAIN SET TO 0 DURING RETURNING OF CALLS FROM CALL STACK
            }
            
        }
        return false;
    }
    static boolean isSafe(int grid[][],int row,int col,int digit){
//CHECKING ROW
        for(int i=0;i<=8;i++){
            if(grid[i][col]==digit) return false;
        }
//CHECKING COLUMN
        for(int j=0;j<=8;j++){
            if(grid[row][j]==digit) return false;
        }
//CHECKING 3X3 GRID
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(grid[i][j]==digit) return false;
            }
        }
        return true;
    }
}