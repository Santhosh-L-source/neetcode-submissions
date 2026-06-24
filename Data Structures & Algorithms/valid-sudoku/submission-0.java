class Solution {
    public boolean isValidSudoku(char[][] board)
    {
      int r=board.length;
      int c=board[0].length;
      for(int i=0;i<r;i++)
      {
        boolean[] row=new boolean[10];
        for(int j=0;j<c;j++)
        {
           if(board[i][j]=='.') continue;
           int d=board[i][j]-'0';
           if(row[d]) return false; 
           row[d]=true;
        }
      }    
      for(int i=0;i<c;i++)
      {
        boolean[] col=new boolean[10];
        for(int j=0;j<r;j++)
        {
           if(board[j][i]=='.') continue;
           int d=board[j][i]-'0';
           if(col[d]) return false; 
           col[d]=true;
        }
      }   
      for(int i=0;i<r-3;i+=3)
      {
        for(int j=0;j<c-3;j+=3)
        {
            boolean[] subM=new boolean[10];
            for(int k=i;k<i+3;k++)
            {
                for(int l=j;l<j+3;l++)
                {
                    if(board[k][l]=='.') continue;
                    int d=board[k][l]-'0';
                    if(subM[d]) return false;
                    subM[d]=true;
                }
            }
        }
      }
      return true;     
    }
}
