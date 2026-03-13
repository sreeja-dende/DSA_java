class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> queue= new ArrayDeque<>();
        for(int i=0;i<rows;i++)
        {for(int j=0;j<cols;j++)
          {
            if(grid[i][j]==0)
            {queue.offer(new int[]{i,j});
            }
          }
        }
        int [][] directions={{0,1},{1,0},{-1,0},{0,-1}};
        while(!queue.isEmpty())
        { int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];
           for (int[] d : directions) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nc < 0 || nr >= rows || nc >= cols)
                    continue;

                if (grid[nr][nc] != Integer.MAX_VALUE)
                    continue;
                grid[nr][nc] = grid[r][c] + 1;
                queue.offer(new int[]{nr, nc});
            }
           

        }
    }
}
