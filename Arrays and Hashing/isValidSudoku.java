class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>rows[]=new HashSet[9];
        HashSet<Character>cols[]=new HashSet[9];
        HashSet<Character>grids[]=new HashSet[9];

         for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            grids[i] = new HashSet<>();
        }
     for(int r=0;r<9;r++)
     {
     for(int c=0;c<9;c++)
     { char val=board[r][c];
        if(val=='.') 
        { continue;
        }
        int grid_index=((r/3)*3)+(c/3);
        if(rows[r].contains(val) || cols[c].contains(val) || grids[grid_index].contains(val))
        {return false;
        }
        rows[r].add(val);
        cols[c].add(val);
        grids[grid_index].add(val);
     }
     }
     return true;
}
}
