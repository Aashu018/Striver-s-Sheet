class Solution {
     public boolean isValidSudoku(char[][] board) {
        //rows
        for(int i=0;i<=8;i++) {
            Set<Character> set=new HashSet<>();
            for(int j=0;j<=8;j++) if(board[i][j]!='.') if(!set.add(board[i][j])) return false;
        }
        //column
        for(int j=0;j<9;j++) {
            Set<Character> set=new HashSet<>();
            for(int i=0;i<9;i++) if(board[i][j]!='.') if(!set.add(board[i][j])) return false;
        }
        //box
        for(int x=0;x<=6;x+=3) for(int y=0;y<=6;y+=3) {
            Set<Character> set=new HashSet<>();
            for(int i=x;i<=x+2;i++) for(int j=y;j<=y+2;j++) if(board[i][j]!='.') if(!set.add(board[i][j])) return false;
        }
        return true;
    }
}